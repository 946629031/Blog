# Chrome DevTools 调试技巧

感觉，如果能把谷歌浏览器的调试工具都玩的很6了，那基本就没有前端你解决不了的问题了

---

按钮位置<BR>(从左到右) | 按钮图标 | 调试快捷键 | 英文描述 | 中文翻译 (机翻..) | 按钮作用 (个人理解) | 参考资料解释
--- | --- | --- | --- | --- |--- | ---
1 | ▶ | f8 | resume script execution | 恢复脚本执行 | ~~不受断点影响，直接恢复脚本执行~~<br>直接执行到下一个断点之前。如果下面没有断点，就直接执行完所有代码 | 逐过程执行”按钮
2 | ⌒ | f10 | step over next function call | 跳过下一个函数调用 | ~~逐行执行，但有时候好像不是逐行...~~<br>执行函数,而不进入函数 | ”逐语句执行“或者叫”逐步执行“
3 | ↓ | f11 | step into next function call | 进入函数调用 | 逐行执行<br>进入该函数 | 
4 | ↑ | Shift + f11 | step out for current function | 退出当前函数 | 跳出当前函数 | 
5 | → | f9 | step | | 真正的 逐步执行 | 

----

- **add conditional breakpoint** 条件断点
	- 条件断点，在对于 for 循环，或者某些特定情况下，暂停，是非常实用的一个功能
	
----

- 右侧面板
	- Call Stack 调用栈
		- 调用栈中，由下往上，一层层执行，最后才执行到我们写的这个文件。（可以理解为基础，要先把下面的基础正确运行起来，上面的才能跑得通）
	- Scope 作用域

----


- Google Chrome 官方文档
		
	- [JavaScript调试参考 - 【谷歌官方讲解调试按钮】](https://developers.google.com/web/tools/chrome-devtools/javascript/reference)
	- [【视频】在 Chrome DevTools 中调试 JavaScript 入门](https://developers.google.com/web/tools/chrome-devtools/javascript/?hl=zh-cn)
	- [使用断点暂停代码](https://developers.google.com/web/tools/chrome-devtools/javascript/breakpoints?hl=zh-cn)

	### 各类断点使用时间概览
	断点类型 | 您想要在以下情况下暂停时可使用此断点类型... 
	--- | ---
	代码行 | 在确切的代码区域中。
	条件代码行 | 在确切的代码区域中，且仅当其他一些条件成立时。
	DOM | 在更改或移除特定 DOM 节点或其子级的代码中。
	XHR | 当 XHR 网址包含字符串模式时。
	事件侦听器 | 在触发 click 等事件后运行的代码中。
	异常 | 在引发已捕获或未捕获异常的代码行中。
	函数 | 任何时候调用特定函数时。


- 参考资料：
	- [Chrome设置断点的各种姿势, js断点调试心得, 【讲解非常详细】](http://justcode.ikeepstudying.com/2018/09/chrome%E8%AE%BE%E7%BD%AE%E6%96%AD%E7%82%B9%E7%9A%84%E5%90%84%E7%A7%8D%E5%A7%BF%E5%8A%BF-js%E6%96%AD%E7%82%B9%E8%B0%83%E8%AF%95%E5%BF%83%E5%BE%97-chrome-devtools-%E4%B8%AD%E8%B0%83%E8%AF%95-javascrip/)
	- [js断点调试心得](https://www.cnblogs.com/mqfblog/p/5397282.html)
	- [你所不知道的 Chrome 控制台调试技巧](https://juejin.im/post/5c6bc3cd518825629e0611d1)
	- [20个Chrome DevTools调试技巧](https://blog.fundebug.com/2018/08/22/art-of-debugging-with-chrome-devtools/)
	- [chrome的调试技巧](https://juejin.im/post/5c0e0fa0e51d452afa65d626)
	- [你所不知道的 Chrome 控制台调试技巧](https://juejin.im/post/5c6bc3cd518825629e0611d1)

- 视频资料
	- [50 个 Chrome Developer Tools 必备技巧](https://www.youtube.com/watch?v=tgl4m6JSkdY&list=PLXbU-2B80FvBhAYNx8qqx6gaNSKX9HlCm&index=47)
	- [如何線上除錯 JavaScript (斷點篇)](https://www.youtube.com/watch?v=O2kdNE2CaaA)
	- [超好用的Chrome DevTool Debug 技巧 | 幫你省下不少時間！](https://www.youtube.com/watch?v=4qUx6lZ1kco)

- 问题遗留
	- js点击按钮如何查看，它执行了哪些函数？chrome怎样查看为一个元素绑定的事件？
	

