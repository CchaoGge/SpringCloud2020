### SpringCloud2020
2020 SpringCloud &amp; SpringCloud & Alibaba

### cloud-provider-payment 8001
服务的提供者 主要负责支付相关的增删改查操作
controller> service >serviceimpl > mapper > mysql

### cloud-consumer-order 80
服务的调用者 不需要考虑对数据的操作只需要考虑如何调用服务的提供方完成工作
使用到的技术> 
RestTemplate (实际上就是对httpCline的封装)
>
RestTemplate提供了多种便捷访问远程Http服务的方法,
是一种简单便捷的访问restful服务模板类,是Spring提供的用于访问Rest服务的客户端模板工具集

使用
使用restTemplate访问restful接口非常的简单粗暴无脑。
(url, requestMap, ResponseBean.class)这三个参数分别代表
REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。