# 2017-01-14
Java养成什么样的编程习惯可以有利于GC? - From zhihu

# 2017-01-21

Mockito是一个针对Java的mocking框架。它与EasyMock和jMock很相似，但是通过在执行后校验什么已经被调用，它消除了对期望行为（expectations）的需要。其它的mocking库需要你在执行前记录期望行为（expectations），而这导致了丑陋的初始化代码。

Stub和Mock

相同点：Stub和Mock对象都是用来模拟外部依赖，使我们能控制。

不同点：而stub完全是模拟一个外部依赖，用来提供测试时所需要的测试数据。而mock对象用来判断测试是否能通过，
也就是用来验证测试中依赖对象间的交互能否达到预期。在mocking框架中mock对象可以同时作为stub和mock对象
使用，两者并没有严格区别。 更多信息：http://martinfowler.com/articles/mocksArentStubs.html·

# 2017-02-18 9:33PM

https://github.com/HalfStackDeveloper/ClassReader 

# 2017-03-28 11：20PM
no commit yesterday

