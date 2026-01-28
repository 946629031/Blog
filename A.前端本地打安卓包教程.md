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

图片: https:

新建一条把安卓sdk的位置放进去
图片: https:

安卓sdk位置获取：

1.点击Android studio右上角的设置按钮，点击settings
图片: https:

2.复制路径并在我的电脑中打开对应目录
图片: https:

3.打开下面的文件夹
图片: https:

4.看是否有adb.exe,如果有直接复制进来的路径
类似：D:\Users\80408764\AppData\Local\Android\Sdk\platform-tools
图片: https:

CMAKE和NDK 安装
cmake下载，4.1.2版本即可

图片: https:
ndk安装和对应版本

打开安卓studio，选sdk tools，勾选NDK和展示对应版本，选择版本27.1.12297006并点击ok，开始下载ndk
图片: https:

二、打包和可能遇到的问题
在bash中运行脚本（第一次运行较慢，不报错即可）
rn连本地的包（命令中有debug）
图片: https:
静态rn包（命令为release）

图片: https:
可能遇到的问题

SDK location （ai解决即可）
图片: https://

下载的ndk缺文件（ai解决）
图片: https://

3.成品位置
打开apk包对应位置
apps/rn/android/app/build/outputs/apk/debug
图片: https:

打开命令行输入adb install -t ，然后把apk包拖进命令行即可，安装成功会出现如下提示
图片: https:
