## getting started

```
git clone https://github.com/geofflangenderfer/hellocombinebykey
cd hellocombinebykey
bash run.sh
```

```
✦ ~/work/hellocombinebykey master* 1m 21s
❯ bash run.sh
[info] welcome to sbt 1.8.0 (Amazon.com Inc. Java 1.8.0_332)
[info] loading project definition from /Users/lgeoff/work/hellocombinebykey/project
[info] loading settings for project hellocombinebykey from build.sbt ...
[info] set current project to Simple Project (in build file:/Users/lgeoff/work/hellocombinebykey/)
[info] compiling 1 Scala source to /Users/lgeoff/work/hellocombinebykey/target/scala-2.12/classes ...
[info] done compiling
[success] Total time: 11 s, completed Nov 14, 2022 4:04:05 PM
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
22/11/14 16:04:07 INFO SparkContext: Running Spark version 3.2.1
22/11/14 16:04:07 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
22/11/14 16:04:08 INFO ResourceUtils: ==============================================================
22/11/14 16:04:08 INFO ResourceUtils: No custom resources configured for spark.driver.
22/11/14 16:04:08 INFO ResourceUtils: ==============================================================
22/11/14 16:04:08 INFO SparkContext: Submitted application: Simple Application
22/11/14 16:04:08 INFO ResourceProfile: Default ResourceProfile created, executor resources: Map(cores -> name: cores, amount: 1, script: , vendor: , memory -> name: memory, amount: 1024, script: , vendor: , offHeap -> name: offHeap, amount: 0, script: , vendor: ), task resources: Map(cpus -> name: cpus, amount: 1.0)
22/11/14 16:04:08 INFO ResourceProfile: Limiting resource is cpu
22/11/14 16:04:08 INFO ResourceProfileManager: Added ResourceProfile id: 0
22/11/14 16:04:08 INFO SecurityManager: Changing view acls to: lgeoff
22/11/14 16:04:08 INFO SecurityManager: Changing modify acls to: lgeoff
22/11/14 16:04:08 INFO SecurityManager: Changing view acls groups to: 
22/11/14 16:04:08 INFO SecurityManager: Changing modify acls groups to: 
22/11/14 16:04:08 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(lgeoff); groups with view permissions: Set(); users  with modify permissions: Set(lgeoff); groups with modify permissions: Set()
22/11/14 16:04:08 INFO Utils: Successfully started service 'sparkDriver' on port 63913.
22/11/14 16:04:08 INFO SparkEnv: Registering MapOutputTracker
22/11/14 16:04:08 INFO SparkEnv: Registering BlockManagerMaster
22/11/14 16:04:08 INFO BlockManagerMasterEndpoint: Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
22/11/14 16:04:08 INFO BlockManagerMasterEndpoint: BlockManagerMasterEndpoint up
22/11/14 16:04:08 INFO SparkEnv: Registering BlockManagerMasterHeartbeat
22/11/14 16:04:08 INFO DiskBlockManager: Created local directory at /private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/blockmgr-cff0029f-4752-47de-8a6f-83ee9382213e
22/11/14 16:04:08 INFO MemoryStore: MemoryStore started with capacity 366.3 MiB
22/11/14 16:04:08 INFO SparkEnv: Registering OutputCommitCoordinator
22/11/14 16:04:08 INFO Utils: Successfully started service 'SparkUI' on port 4040.
22/11/14 16:04:09 INFO SparkUI: Bound SparkUI to 0.0.0.0, and started at http://192.168.1.17:4040
22/11/14 16:04:09 INFO SparkContext: Added JAR file:/Users/lgeoff/work/hellocombinebykey/target/scala-2.12/simple-project_2.12-1.0.jar at spark://192.168.1.17:63913/jars/simple-project_2.12-1.0.jar with timestamp 1668470647856
22/11/14 16:04:09 INFO Executor: Starting executor ID driver on host 192.168.1.17
22/11/14 16:04:09 INFO Executor: Fetching spark://192.168.1.17:63913/jars/simple-project_2.12-1.0.jar with timestamp 1668470647856
22/11/14 16:04:09 INFO TransportClientFactory: Successfully created connection to /192.168.1.17:63913 after 52 ms (0 ms spent in bootstraps)
22/11/14 16:04:09 INFO Utils: Fetching spark://192.168.1.17:63913/jars/simple-project_2.12-1.0.jar to /private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/spark-0befd825-5377-47b6-8d19-404c311febd7/userFiles-61e7f0ee-a1f1-4982-bb5b-d861eee57327/fetchFileTemp5000948474162207279.tmp
22/11/14 16:04:09 INFO Executor: Adding file:/private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/spark-0befd825-5377-47b6-8d19-404c311febd7/userFiles-61e7f0ee-a1f1-4982-bb5b-d861eee57327/simple-project_2.12-1.0.jar to class loader
22/11/14 16:04:09 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 63917.
22/11/14 16:04:09 INFO NettyBlockTransferService: Server created on 192.168.1.17:63917
22/11/14 16:04:09 INFO BlockManager: Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
22/11/14 16:04:09 INFO BlockManagerMaster: Registering BlockManager BlockManagerId(driver, 192.168.1.17, 63917, None)
22/11/14 16:04:09 INFO BlockManagerMasterEndpoint: Registering block manager 192.168.1.17:63917 with 366.3 MiB RAM, BlockManagerId(driver, 192.168.1.17, 63917, None)
22/11/14 16:04:09 INFO BlockManagerMaster: Registered BlockManager BlockManagerId(driver, 192.168.1.17, 63917, None)
22/11/14 16:04:09 INFO BlockManager: Initialized BlockManager: BlockManagerId(driver, 192.168.1.17, 63917, None)
22/11/14 16:04:11 INFO SharedState: Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir.
22/11/14 16:04:12 INFO SharedState: Warehouse path is 'file:/Users/lgeoff/work/hellocombinebykey/spark-warehouse'.
22/11/14 16:04:13 INFO CodeGenerator: Code generated in 294.635667 ms
22/11/14 16:04:14 INFO CodeGenerator: Code generated in 33.575958 ms
22/11/14 16:04:14 INFO CodeGenerator: Code generated in 27.396584 ms
+---+---+
| _1| _2|
+---+---+
|  a|  1|
|  b|  2|
|  a|  3|
|  c|  9|
|  b|  6|
+---+---+

22/11/14 16:04:14 INFO CodeGenerator: Code generated in 31.077541 ms
22/11/14 16:04:15 INFO CodeGenerator: Code generated in 106.436958 ms
22/11/14 16:04:15 INFO SparkContext: Starting job: show at HelloCombineByKey.scala:28
22/11/14 16:04:15 INFO DAGScheduler: Registering RDD 4 (rdd at HelloCombineByKey.scala:22) as input to shuffle 0
22/11/14 16:04:15 INFO DAGScheduler: Got job 0 (show at HelloCombineByKey.scala:28) with 1 output partitions
22/11/14 16:04:15 INFO DAGScheduler: Final stage: ResultStage 1 (show at HelloCombineByKey.scala:28)
22/11/14 16:04:15 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 0)
22/11/14 16:04:15 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 0)
22/11/14 16:04:15 INFO DAGScheduler: Submitting ShuffleMapStage 0 (MapPartitionsRDD[4] at rdd at HelloCombineByKey.scala:22), which has no missing parents
22/11/14 16:04:15 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 16.3 KiB, free 366.3 MiB)
22/11/14 16:04:16 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 8.1 KiB, free 366.3 MiB)
22/11/14 16:04:16 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on 192.168.1.17:63917 (size: 8.1 KiB, free: 366.3 MiB)
22/11/14 16:04:16 INFO SparkContext: Created broadcast 0 from broadcast at DAGScheduler.scala:1478
22/11/14 16:04:16 INFO DAGScheduler: Submitting 5 missing tasks from ShuffleMapStage 0 (MapPartitionsRDD[4] at rdd at HelloCombineByKey.scala:22) (first 15 tasks are for partitions Vector(0, 1, 2, 3, 4))
22/11/14 16:04:16 INFO TaskSchedulerImpl: Adding task set 0.0 with 5 tasks resource profile 0
22/11/14 16:04:16 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0) (192.168.1.17, executor driver, partition 0, PROCESS_LOCAL, 4630 bytes) taskResourceAssignments Map()
22/11/14 16:04:16 INFO TaskSetManager: Starting task 1.0 in stage 0.0 (TID 1) (192.168.1.17, executor driver, partition 1, PROCESS_LOCAL, 4630 bytes) taskResourceAssignments Map()
22/11/14 16:04:16 INFO TaskSetManager: Starting task 2.0 in stage 0.0 (TID 2) (192.168.1.17, executor driver, partition 2, PROCESS_LOCAL, 4630 bytes) taskResourceAssignments Map()
22/11/14 16:04:16 INFO TaskSetManager: Starting task 3.0 in stage 0.0 (TID 3) (192.168.1.17, executor driver, partition 3, PROCESS_LOCAL, 4630 bytes) taskResourceAssignments Map()
22/11/14 16:04:16 INFO TaskSetManager: Starting task 4.0 in stage 0.0 (TID 4) (192.168.1.17, executor driver, partition 4, PROCESS_LOCAL, 4630 bytes) taskResourceAssignments Map()
22/11/14 16:04:16 INFO Executor: Running task 1.0 in stage 0.0 (TID 1)
22/11/14 16:04:16 INFO Executor: Running task 3.0 in stage 0.0 (TID 3)
22/11/14 16:04:16 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
22/11/14 16:04:16 INFO Executor: Running task 4.0 in stage 0.0 (TID 4)
22/11/14 16:04:16 INFO Executor: Running task 2.0 in stage 0.0 (TID 2)
22/11/14 16:04:17 INFO CodeGenerator: Code generated in 60.587625 ms
22/11/14 16:04:17 INFO Executor: Finished task 4.0 in stage 0.0 (TID 4). 1474 bytes result sent to driver
22/11/14 16:04:17 INFO Executor: Finished task 1.0 in stage 0.0 (TID 1). 1474 bytes result sent to driver
22/11/14 16:04:17 INFO Executor: Finished task 3.0 in stage 0.0 (TID 3). 1474 bytes result sent to driver
22/11/14 16:04:17 INFO Executor: Finished task 2.0 in stage 0.0 (TID 2). 1474 bytes result sent to driver
22/11/14 16:04:17 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1474 bytes result sent to driver
22/11/14 16:04:17 INFO TaskSetManager: Finished task 2.0 in stage 0.0 (TID 2) in 1523 ms on 192.168.1.17 (executor driver) (1/5)
22/11/14 16:04:17 INFO TaskSetManager: Finished task 4.0 in stage 0.0 (TID 4) in 1527 ms on 192.168.1.17 (executor driver) (2/5)
22/11/14 16:04:17 INFO TaskSetManager: Finished task 1.0 in stage 0.0 (TID 1) in 1532 ms on 192.168.1.17 (executor driver) (3/5)
22/11/14 16:04:17 INFO TaskSetManager: Finished task 3.0 in stage 0.0 (TID 3) in 1528 ms on 192.168.1.17 (executor driver) (4/5)
22/11/14 16:04:17 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 1572 ms on 192.168.1.17 (executor driver) (5/5)
22/11/14 16:04:17 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
22/11/14 16:04:17 INFO DAGScheduler: ShuffleMapStage 0 (rdd at HelloCombineByKey.scala:22) finished in 2.162 s
22/11/14 16:04:17 INFO DAGScheduler: looking for newly runnable stages
22/11/14 16:04:17 INFO DAGScheduler: running: Set()
22/11/14 16:04:17 INFO DAGScheduler: waiting: Set(ResultStage 1)
22/11/14 16:04:17 INFO DAGScheduler: failed: Set()
22/11/14 16:04:17 INFO DAGScheduler: Submitting ResultStage 1 (MapPartitionsRDD[8] at show at HelloCombineByKey.scala:28), which has no missing parents
22/11/14 16:04:17 INFO MemoryStore: Block broadcast_1 stored as values in memory (estimated size 18.2 KiB, free 366.3 MiB)
22/11/14 16:04:17 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 7.3 KiB, free 366.3 MiB)
22/11/14 16:04:17 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory on 192.168.1.17:63917 (size: 7.3 KiB, free: 366.3 MiB)
22/11/14 16:04:17 INFO SparkContext: Created broadcast 1 from broadcast at DAGScheduler.scala:1478
22/11/14 16:04:17 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 1 (MapPartitionsRDD[8] at show at HelloCombineByKey.scala:28) (first 15 tasks are for partitions Vector(0))
22/11/14 16:04:17 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks resource profile 0
22/11/14 16:04:17 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 5) (192.168.1.17, executor driver, partition 0, PROCESS_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:17 INFO Executor: Running task 0.0 in stage 1.0 (TID 5)
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 0 (0.0 B) non-empty blocks including 0 (0.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 19 ms
22/11/14 16:04:18 INFO Executor: Finished task 0.0 in stage 1.0 (TID 5). 1820 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 5) in 172 ms on 192.168.1.17 (executor driver) (1/1)
22/11/14 16:04:18 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks have all completed, from pool 
22/11/14 16:04:18 INFO DAGScheduler: ResultStage 1 (show at HelloCombineByKey.scala:28) finished in 0.253 s
22/11/14 16:04:18 INFO DAGScheduler: Job 0 is finished. Cancelling potential speculative or zombie tasks for this job
22/11/14 16:04:18 INFO TaskSchedulerImpl: Killing all running tasks in stage 1: Stage finished
22/11/14 16:04:18 INFO DAGScheduler: Job 0 finished: show at HelloCombineByKey.scala:28, took 2.544012 s
22/11/14 16:04:18 INFO SparkContext: Starting job: show at HelloCombineByKey.scala:28
22/11/14 16:04:18 INFO DAGScheduler: Got job 1 (show at HelloCombineByKey.scala:28) with 4 output partitions
22/11/14 16:04:18 INFO DAGScheduler: Final stage: ResultStage 3 (show at HelloCombineByKey.scala:28)
22/11/14 16:04:18 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 2)
22/11/14 16:04:18 INFO DAGScheduler: Missing parents: List()
22/11/14 16:04:18 INFO DAGScheduler: Submitting ResultStage 3 (MapPartitionsRDD[8] at show at HelloCombineByKey.scala:28), which has no missing parents
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_2 stored as values in memory (estimated size 18.2 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes in memory (estimated size 7.3 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory on 192.168.1.17:63917 (size: 7.3 KiB, free: 366.3 MiB)
22/11/14 16:04:18 INFO SparkContext: Created broadcast 2 from broadcast at DAGScheduler.scala:1478
22/11/14 16:04:18 INFO DAGScheduler: Submitting 4 missing tasks from ResultStage 3 (MapPartitionsRDD[8] at show at HelloCombineByKey.scala:28) (first 15 tasks are for partitions Vector(1, 2, 3, 4))
22/11/14 16:04:18 INFO TaskSchedulerImpl: Adding task set 3.0 with 4 tasks resource profile 0
22/11/14 16:04:18 INFO TaskSetManager: Starting task 1.0 in stage 3.0 (TID 6) (192.168.1.17, executor driver, partition 2, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 2.0 in stage 3.0 (TID 7) (192.168.1.17, executor driver, partition 3, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 3.0 in stage 3.0 (TID 8) (192.168.1.17, executor driver, partition 4, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 0.0 in stage 3.0 (TID 9) (192.168.1.17, executor driver, partition 1, PROCESS_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO Executor: Running task 0.0 in stage 3.0 (TID 9)
22/11/14 16:04:18 INFO Executor: Running task 3.0 in stage 3.0 (TID 8)
22/11/14 16:04:18 INFO Executor: Running task 1.0 in stage 3.0 (TID 6)
22/11/14 16:04:18 INFO Executor: Running task 2.0 in stage 3.0 (TID 7)
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 0 (0.0 B) non-empty blocks including 0 (0.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 6 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 2 (378.0 B) non-empty blocks including 2 (378.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 9 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 1 (189.0 B) non-empty blocks including 1 (189.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 11 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 2 (378.0 B) non-empty blocks including 2 (378.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 16 ms
22/11/14 16:04:18 INFO Executor: Finished task 0.0 in stage 3.0 (TID 9). 1777 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 0.0 in stage 3.0 (TID 9) in 78 ms on 192.168.1.17 (executor driver) (1/4)
22/11/14 16:04:18 INFO Executor: Finished task 3.0 in stage 3.0 (TID 8). 1818 bytes result sent to driver
22/11/14 16:04:18 INFO Executor: Finished task 1.0 in stage 3.0 (TID 6). 1818 bytes result sent to driver
22/11/14 16:04:18 INFO Executor: Finished task 2.0 in stage 3.0 (TID 7). 1818 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 3.0 in stage 3.0 (TID 8) in 120 ms on 192.168.1.17 (executor driver) (2/4)
22/11/14 16:04:18 INFO TaskSetManager: Finished task 2.0 in stage 3.0 (TID 7) in 122 ms on 192.168.1.17 (executor driver) (3/4)
22/11/14 16:04:18 INFO TaskSetManager: Finished task 1.0 in stage 3.0 (TID 6) in 124 ms on 192.168.1.17 (executor driver) (4/4)
22/11/14 16:04:18 INFO TaskSchedulerImpl: Removed TaskSet 3.0, whose tasks have all completed, from pool 
22/11/14 16:04:18 INFO DAGScheduler: ResultStage 3 (show at HelloCombineByKey.scala:28) finished in 0.153 s
22/11/14 16:04:18 INFO DAGScheduler: Job 1 is finished. Cancelling potential speculative or zombie tasks for this job
22/11/14 16:04:18 INFO TaskSchedulerImpl: Killing all running tasks in stage 3: Stage finished
22/11/14 16:04:18 INFO DAGScheduler: Job 1 finished: show at HelloCombineByKey.scala:28, took 0.169075 s
22/11/14 16:04:18 INFO CodeGenerator: Code generated in 37.255541 ms
+---+------+
| _1|    _2|
+---+------+
|  a|{4, 2}|
|  b|{8, 2}|
|  c|{9, 1}|
+---+------+

22/11/14 16:04:18 INFO CodeGenerator: Code generated in 34.975 ms
22/11/14 16:04:18 INFO SparkContext: Starting job: show at HelloCombineByKey.scala:39
22/11/14 16:04:18 INFO DAGScheduler: Got job 2 (show at HelloCombineByKey.scala:39) with 1 output partitions
22/11/14 16:04:18 INFO DAGScheduler: Final stage: ResultStage 5 (show at HelloCombineByKey.scala:39)
22/11/14 16:04:18 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 4)
22/11/14 16:04:18 INFO DAGScheduler: Missing parents: List()
22/11/14 16:04:18 INFO DAGScheduler: Submitting ResultStage 5 (MapPartitionsRDD[11] at show at HelloCombineByKey.scala:39), which has no missing parents
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_3 stored as values in memory (estimated size 14.7 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_3_piece0 stored as bytes in memory (estimated size 6.7 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO BlockManagerInfo: Added broadcast_3_piece0 in memory on 192.168.1.17:63917 (size: 6.7 KiB, free: 366.3 MiB)
22/11/14 16:04:18 INFO SparkContext: Created broadcast 3 from broadcast at DAGScheduler.scala:1478
22/11/14 16:04:18 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 5 (MapPartitionsRDD[11] at show at HelloCombineByKey.scala:39) (first 15 tasks are for partitions Vector(0))
22/11/14 16:04:18 INFO TaskSchedulerImpl: Adding task set 5.0 with 1 tasks resource profile 0
22/11/14 16:04:18 INFO TaskSetManager: Starting task 0.0 in stage 5.0 (TID 10) (192.168.1.17, executor driver, partition 0, PROCESS_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO Executor: Running task 0.0 in stage 5.0 (TID 10)
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 0 (0.0 B) non-empty blocks including 0 (0.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 2 ms
22/11/14 16:04:18 INFO Executor: Finished task 0.0 in stage 5.0 (TID 10). 1777 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 0.0 in stage 5.0 (TID 10) in 49 ms on 192.168.1.17 (executor driver) (1/1)
22/11/14 16:04:18 INFO TaskSchedulerImpl: Removed TaskSet 5.0, whose tasks have all completed, from pool 
22/11/14 16:04:18 INFO DAGScheduler: ResultStage 5 (show at HelloCombineByKey.scala:39) finished in 0.077 s
22/11/14 16:04:18 INFO DAGScheduler: Job 2 is finished. Cancelling potential speculative or zombie tasks for this job
22/11/14 16:04:18 INFO TaskSchedulerImpl: Killing all running tasks in stage 5: Stage finished
22/11/14 16:04:18 INFO DAGScheduler: Job 2 finished: show at HelloCombineByKey.scala:39, took 0.094650 s
22/11/14 16:04:18 INFO SparkContext: Starting job: show at HelloCombineByKey.scala:39
22/11/14 16:04:18 INFO DAGScheduler: Got job 3 (show at HelloCombineByKey.scala:39) with 4 output partitions
22/11/14 16:04:18 INFO DAGScheduler: Final stage: ResultStage 7 (show at HelloCombineByKey.scala:39)
22/11/14 16:04:18 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 6)
22/11/14 16:04:18 INFO DAGScheduler: Missing parents: List()
22/11/14 16:04:18 INFO DAGScheduler: Submitting ResultStage 7 (MapPartitionsRDD[11] at show at HelloCombineByKey.scala:39), which has no missing parents
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_4 stored as values in memory (estimated size 14.7 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO MemoryStore: Block broadcast_4_piece0 stored as bytes in memory (estimated size 6.7 KiB, free 366.2 MiB)
22/11/14 16:04:18 INFO BlockManagerInfo: Added broadcast_4_piece0 in memory on 192.168.1.17:63917 (size: 6.7 KiB, free: 366.3 MiB)
22/11/14 16:04:18 INFO SparkContext: Created broadcast 4 from broadcast at DAGScheduler.scala:1478
22/11/14 16:04:18 INFO DAGScheduler: Submitting 4 missing tasks from ResultStage 7 (MapPartitionsRDD[11] at show at HelloCombineByKey.scala:39) (first 15 tasks are for partitions Vector(1, 2, 3, 4))
22/11/14 16:04:18 INFO TaskSchedulerImpl: Adding task set 7.0 with 4 tasks resource profile 0
22/11/14 16:04:18 INFO TaskSetManager: Starting task 1.0 in stage 7.0 (TID 11) (192.168.1.17, executor driver, partition 2, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 2.0 in stage 7.0 (TID 12) (192.168.1.17, executor driver, partition 3, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 3.0 in stage 7.0 (TID 13) (192.168.1.17, executor driver, partition 4, NODE_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO TaskSetManager: Starting task 0.0 in stage 7.0 (TID 14) (192.168.1.17, executor driver, partition 1, PROCESS_LOCAL, 4271 bytes) taskResourceAssignments Map()
22/11/14 16:04:18 INFO Executor: Running task 1.0 in stage 7.0 (TID 11)
22/11/14 16:04:18 INFO Executor: Running task 0.0 in stage 7.0 (TID 14)
22/11/14 16:04:18 INFO Executor: Running task 2.0 in stage 7.0 (TID 12)
22/11/14 16:04:18 INFO Executor: Running task 3.0 in stage 7.0 (TID 13)
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 2 (378.0 B) non-empty blocks including 2 (378.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 0 (0.0 B) non-empty blocks including 0 (0.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 1 (189.0 B) non-empty blocks including 1 (189.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 3 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 3 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 3 ms
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Getting 2 (378.0 B) non-empty blocks including 2 (378.0 B) local and 0 (0.0 B) host-local and 0 (0.0 B) push-merged-local and 0 (0.0 B) remote blocks
22/11/14 16:04:18 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 9 ms
22/11/14 16:04:18 INFO Executor: Finished task 0.0 in stage 7.0 (TID 14). 1777 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 0.0 in stage 7.0 (TID 14) in 47 ms on 192.168.1.17 (executor driver) (1/4)
22/11/14 16:04:18 INFO Executor: Finished task 2.0 in stage 7.0 (TID 12). 1813 bytes result sent to driver
22/11/14 16:04:18 INFO Executor: Finished task 1.0 in stage 7.0 (TID 11). 1813 bytes result sent to driver
22/11/14 16:04:18 INFO Executor: Finished task 3.0 in stage 7.0 (TID 13). 1813 bytes result sent to driver
22/11/14 16:04:18 INFO TaskSetManager: Finished task 1.0 in stage 7.0 (TID 11) in 74 ms on 192.168.1.17 (executor driver) (2/4)
22/11/14 16:04:18 INFO TaskSetManager: Finished task 3.0 in stage 7.0 (TID 13) in 72 ms on 192.168.1.17 (executor driver) (3/4)
22/11/14 16:04:18 INFO TaskSetManager: Finished task 2.0 in stage 7.0 (TID 12) in 73 ms on 192.168.1.17 (executor driver) (4/4)
22/11/14 16:04:18 INFO TaskSchedulerImpl: Removed TaskSet 7.0, whose tasks have all completed, from pool 
22/11/14 16:04:18 INFO DAGScheduler: ResultStage 7 (show at HelloCombineByKey.scala:39) finished in 0.095 s
22/11/14 16:04:18 INFO DAGScheduler: Job 3 is finished. Cancelling potential speculative or zombie tasks for this job
22/11/14 16:04:18 INFO TaskSchedulerImpl: Killing all running tasks in stage 7: Stage finished
22/11/14 16:04:18 INFO DAGScheduler: Job 3 finished: show at HelloCombineByKey.scala:39, took 0.108297 s
+---+---+
| _1| _2|
+---+---+
|  a|  2|
|  b|  4|
|  c|  9|
+---+---+

22/11/14 16:04:18 INFO SparkUI: Stopped Spark web UI at http://192.168.1.17:4040
22/11/14 16:04:18 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
22/11/14 16:04:18 INFO MemoryStore: MemoryStore cleared
22/11/14 16:04:18 INFO BlockManager: BlockManager stopped
22/11/14 16:04:18 INFO BlockManagerMaster: BlockManagerMaster stopped
22/11/14 16:04:18 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
22/11/14 16:04:19 INFO SparkContext: Successfully stopped SparkContext
22/11/14 16:04:19 INFO ShutdownHookManager: Shutdown hook called
22/11/14 16:04:19 INFO ShutdownHookManager: Deleting directory /private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/spark-0befd825-5377-47b6-8d19-404c311febd7
22/11/14 16:04:19 INFO ShutdownHookManager: Deleting directory /private/var/folders/4s/6nbhf11j0bq0d7m_8v_9x52w0000gs/T/spark-eeccaa15-b431-4580-9f0b-6d9c3bee4b71
```
