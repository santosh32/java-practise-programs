Java Memory Model & Garbage collection
-
The below explanation mainly holds for JRE 5.0+ - 7.0. JMM(Java memory model) is divided into mainly 3 parts

- Young generation
- Old Generation
- Perm Gen
Young Generation is further divided into

- Eden space
- S0 (survivor space)
- S1 (survivor space)



Young Generation
-
Eden space is a place where new objects are created. When the space is filled upto a certain percentage, GC is perfomed. This event is called as **Minor GC.**

The surviving objects from Eden space are moved to survivor spaces(S0 & S1).

Minor GC checks the object in survivor spaces and move to other survivor spaces (S0->S1).

Objects surviving mutiple minor GC are moved to old generation.

Old Generation -Tenured
-
Objects survived multiple minor GC are moved to old generation. When an old generation is full, the major GC takes place to remove the unused objects. This event can cause a minor pause in the working of application. Too many frequent major GC can trigger performance issue in the application. While designing an application, one should be considerate about it.

Perm Gen
-
Perm Gen contains the metadata of the classes.

- Methods of a class (including the bytecodes)
- Names of the classes (in the form of an object that points to a string also in the permanent generation)
- Constant pool(e.g String pool) information (data read from the class file, see chapter 4 of the JVM specification for all the details).
- Object arrays and type arrays associated with a class (e.g., an object array containing references to methods).
- Internal objects created by the JVM (java/lang/Object or java/lang/exception for instance)

**When does an object becomes eligible for GC.**

- When a object is not referred by other objects or all its references are set to null.
- Object moves out of the scope.
- Weak reference objects, such as WeakHashMap
**Note: Perm Gen is not available in Java 8 anymore**

Note: Java programmer cannot force the GC from program using **System.gc() or Runtime.gc()**

What are different type of Garbage collector?
-

- **Serial GC (-XX:+UseSerialGC):** Serial GC uses the simple mark-sweep-compact approach for young and old generations garbage collection i.e Minor and Major GC. Serial GC is useful in client-machines such as our simple stand alone applications and machines with smaller CPU. It is good for smaller applications with low memory footprint.
- **Parallel GC (-XX:+UseParallelGC):** Parallel GC is same as Serial GC except that is spawns N threads for young generation garbage collection where N is the number of CPU cores in the system. We can control the number of threads using -XX:ParallelGCThreads=n JVM option. Parallel Garbage Collector is also called throughput collector because it uses multiple CPUs to speed up the GC performance. Parallel GC uses single thread for Old Generation garbage collection.
- **Parallel Old GC (-XX:+UseParallelOldGC):** This is same as Parallel GC except that it uses multiple threads for both Young Generation and Old Generation garbage collection.
- **Concurrent Mark Sweep (CMS) Collector (-XX:+UseConcMarkSweepGC):** CMS Collector is also referred as concurrent low pause collector. It does the garbage collection for Old generation. CMS collector tries to minimize the pauses due to garbage collection by doing most of the garbage collection work concurrently with the application threads. CMS collector on young generation uses the same algorithm as that of the parallel collector. This garbage collector is suitable for responsive applications where we canâ€™t afford longer pause times. We can limit the number of threads in CMS collector using -XX:ParallelCMSThreads=n JVM option.
- **G1 Garbage Collector (-XX:+UseG1GC):** The Garbage First or G1 garbage collector is available from Java 7 and itâ€™s long term goal is to replace the CMS collector. The G1 collector is a parallel, concurrent, and incrementally compacting low-pause garbage collector. Garbage First Collector doesn't work like other collectors and there is no concept of Young and Old generation space. It divides the heap space into multiple equal-sized heap regions. When a garbage collection is invoked, it first collects the region with lesser live data, hence "Garbage First". You 