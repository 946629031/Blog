一、环境准备
1.Android Studio下载
打开公司的GDesk找到Android Studio，下载完成后一路点下一步就行，进入Android studio会有下载sdk提醒，一开始进度条会卡在0不动，不用管它会下载好的。




3.java jdk安装
下载下面的附件然后一路确认
附件: jdk-17.0.13_windows-x64_bin.exe https://odocs.myoas.com/uploader/f/OY3npDwdVo5EeqpP.exe?accessToken=eyJhbGciOiJIUzI1NiIsImtpZCI6ImRlZmF1bHQiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE3Njk1OTk1MzksImZpbGVHVUlEIjoiTjJBMU04TWd5eXVLRTJBRCIsImlhdCI6MTc2OTU5ODkzOSwiaXNzIjoidXBsb2FkZXJfYWNjZXNzX3Jlc291cmNlIiwicGFhIjoiYWxsOmFsbDo4ZmUzNjY3OC04NWE4LTQ0YWItYWQ4MC1lYWYyOTEwMjA3MDAiLCJ1c2VySWQiOjMzMzQ2OX0.nKee3Zm4ulUWyRPm8kwFJXuBIGgaaBrmRbOsg7ddZug

按照下面csdn的教程配置一下java的环境变量
https://blog.csdn.net/godot06/article/details/104378253


4.adb权限申请
-前往UPM权限自助中心 -> 点击我的权限 -> 使用中 -> 显示我的全部权限，搜索是否有adb，如显示暂无数据，请点击👉Adb/Mtp权限提交申请。

5.adb加入环境变量
右键我的电脑->属性->高级系统设置->环境变量
双击path

![](https://p9-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/8b03e6be904e4774965d0c73c921484a.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=2YebtOFBgaRuNRN3e%2BUPldUV0ek%3D)

新建一条把安卓sdk的位置放进去
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/871d148485ed4fd498463d884b77633e.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=4twWJXr4f3FmTlBaBJ28oo%2FdmOg%3D)

安卓sdk位置获取：

1.点击Android studio右上角的设置按钮，点击settings
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/9f350e5ec57b4a6ba297ae54e291f7e4.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=h3geKPpuJJSAGNX3vd1e9UkcNCU%3D)

2.复制路径并在我的电脑中打开对应目录
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/98a62c60f477473988837b4f374799cd.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=KdCPUFCSQB7CYDar5RbfzGjUHzc%3D)

3.打开下面的文件夹
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/a9d43861958545d8b3ed13e76a652423.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=kCLYz%2FlCPQUKLyjcE0P%2F63GtbN0%3D)

4.看是否有adb.exe,如果有直接复制进来的路径
类似：D:\Users\80408764\AppData\Local\Android\Sdk\platform-tools
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/9a8a20073bde4b3aa5e3f310fa42b532.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=5OAH4qX9Kn%2ByRZsOzgFzD1jPhgU%3D)

## CMAKE和NDK 安装
cmake下载，4.1.2版本即可

![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/18f5d33ec9ec47a4bce3cd26c60e0b10.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=Epg2FZrqWznTZ4sr8Mkz8ZUR6RQ%3D)
ndk安装和对应版本

打开安卓studio，选sdk tools，勾选NDK和展示对应版本，选择版本27.1.12297006并点击ok，开始下载ndk
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/8339559591764198a1d580acb1f4476e.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=QR%2BeQ3xVJJtX0plHKk1rQGhA%2FDM%3D)

# 二、打包和可能遇到的问题
在bash中运行脚本（第一次运行较慢，不报错即可）
rn连本地的包（命令中有debug）
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/71747857449841b69a91ab84a588cadb.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=lk8VfXa8x3FAOJGEa2a91XF938c%3D)
静态rn包（命令为release）

![](https://p9-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/f5e3f8cdf9924425951aaf5337c6dc41.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=20260128192841E883347C7BF55024A5FE&rrcfp=dafada99&x-expires=2085823722&x-signature=LauFEXTH7P6tdjwr8taQZh3DI8Q%3D)
可能遇到的问题

SDK location （ai解决即可）
![](https://p9-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/1b2cefa6558042c2b98d8ff9daf90176.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=202601281929149DC692EFB46E82247F67&rrcfp=dafada99&x-expires=2085823754&x-signature=ajfnSzNOMa3ouOg3OUwxBKX17EU%3D)

下载的ndk缺文件（ai解决）
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/37fa57fffc9f4918afb9df1322da763c.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=202601281929149DC692EFB46E82247F67&rrcfp=dafada99&x-expires=2085823754&x-signature=ZPBIlXN8Whd2sf78IrEqPGXvjxk%3D)

3.成品位置
打开apk包对应位置
apps/rn/android/app/build/outputs/apk/debug
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/b7af5e10d0664034a1a62ce7da43d702.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=202601281929149DC692EFB46E82247F67&rrcfp=dafada99&x-expires=2085823754&x-signature=JEdTqTqIwxMWZ1LPGBMGZsFdlWg%3D)

打开命令行输入adb install -t ，然后把apk包拖进命令行即可，安装成功会出现如下提示
![](https://p3-flow-imagex-sign.byteimg.com/tos-cn-i-a9rns2rl98/f72696e49d1848e295590aa9943676e5.png~tplv-a9rns2rl98-image.png?lk3s=8e244e95&rcl=202601281929149DC692EFB46E82247F67&rrcfp=dafada99&x-expires=2085823754&x-signature=ppDhGhRqlr%2BDJEUVMDreHS81yro%3D)
