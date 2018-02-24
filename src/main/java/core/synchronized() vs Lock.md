Java Lock vs synchronized
--
Based on above details and program, we can easily conclude following differences between Java Lock and synchronization.

- Java Lock API provides more visibility and options for locking, unlike synchronized where a thread might end up waiting indefinitely for the lock, we can use tryLock() to make sure thread waits for specific time only.
- Synchronization code is much cleaner and easy to maintain whereas with Lock we are forced to have try-finally block to make sure Lock is released even if some exception is thrown between lock() and unlock() method calls.
- synchronization blocks or methods can cover only one method whereas we can acquire the lock in one method and release it in another method with Lock API.
- synchronized keyword doesn’t provide fairness whereas we can set fairness to true while creating ReentrantLock object so that longest waiting thread gets the lock first.
- We can create different conditions for Lock and different thread can await() for different conditions.

That’s all for Java Lock example, ReentrantLock in java and a comparative analysis with synchronized keyword.
