# 基于 SpringBoot+Maven+Mybatis+Redis+RabbitMQ 高并发商城秒杀系统
# 开发工具
IntelliJ IDEA 2017.3.1 x64

# 开发环境
JDK |	Maven |	Mysql |	SpringBoot | redis | RabbitMQ
--|:--:|--:|--:|--:|--:
1.8 |3.2.2 | 5.5 | 1.5.9.RELEASE | 3.2 | 3.7.14
# 使用说明
1. 下载代码 git clone https://github.com/15768323663/Miaosha 将项目下载到IDEA里面
2. 到src/main/resources下的application.properties下修改你的数据库链接用户名与密码
3. 安装redis、mysql、rabbitmq、maven等环境
4. 启动前，检查配置 application.properties 中相关redis、mysql、rabbitmq地址
5. 在数据库秒杀商品表里面设置合理的秒杀开始时间与结束时间
6. 登录地址：http://localhost:8080/login/to_login
7. 商品秒杀列表地址：http://localhost:8080/goods/to_list

# 项目描述：
1. 使用分布式Seesion，让多台服务器可以响应。
2. 使用redis做缓存提高访问速度和并发量，减少数据库压力。
3. 使用页面静态化，缓存页面至浏览器，前后端分离降低服务器压力。
4. 使用消息队列完成异步下单，提升用户体验，削峰和降流。
5. 安全性优化：双重md5密码校验，秒杀接口地址的隐藏，接口限流防刷，数学公式验证码。
# 图片演示
登录页面
![登录](https://github.com/15768323663/Miaosha/blob/master/photo/login.png)

商品列表页面

![商品列表](https://github.com/15768323663/Miaosha/blob/master/photo/list.png)

商品详情页面

![商品详情](https://github.com/15768323663/Miaosha/blob/master/photo/goodsdetail.png)

商品秒杀倒计时

![秒杀](https://github.com/15768323663/Miaosha/blob/master/photo/wait.png)

成功秒杀页面

![成功](https://github.com/15768323663/Miaosha/blob/master/photo/miaoshasuccess.png)
