### 线程的创建和启动

---

> Java使用Thread类代表线程，所有的线程对象都必须是Thread类或其子类的实例。每个线程的作用是完成一定的任务，实际就是执行一定的程序流。

####  继承Thread类创建线程类

1. 定义Thread类的子类，并且重写该类的run（）方法，该run（）方法代表线程要完成的任务
2. 常见Thread子类的实例，既创建了线程对象
3. 调用线程对象的start（）方法来启动线程

#### 实现Runnable接口创建线程类

实现Runnable接口来创建并启动多线程的步骤如下

1. 定义Runnable接口的实现类，并重写该接口的run（）方法
2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象。

### 使用Callable和Future创建线程

