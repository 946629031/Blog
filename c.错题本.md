## 默写 Vue 生命周期
  ```js
  vue 生命周期
  vue2:
  beforeCreate
  created
  beforeMount
  beforeMounted            ---------> mounted
  beforeUpdate
  updated
  beforeDestroy
  destroyed
  activated
  deactivated
  
  vue3
  setup  
  onBeforeMount
  onMounted
  onBeforeUpdate
  onUpdated
  onBeforeUnmount
  onUnmounted
  onActivated
  onDeactivated
  
  --------> onRenderTracked
  --------> onRenderTriggered
  ```









## 防抖函数 默写
```js
function debounce (fn, delay) {
  let timer = null
  return function () {
    if (timer) clearTimeout(timer)
    timer = setTimeout(fn, delay)
  }
}
```
```js
/**
 * 标准防抖函数（修复所有问题，支持取消防抖）
 * @param {Function} fn - 要防抖的函数
 * @param {number} delay - 防抖延迟（毫秒）
 * @returns {Function} 防抖后的函数（附带 cancel 方法用于取消防抖）
 */
function debounce(fn, delay) {
  let timer = null;

  // 定义防抖核心函数
  const debounced = function (...args) {
    // 1. 清空旧定时器（核心逻辑，你的代码这部分是对的）
    if (timer) clearTimeout(timer);

    // 2. 绑定 this + 传递事件参数
    timer = setTimeout(() => {
      fn.apply(this, args); // 关键：用 apply 绑定this，传递参数
    }, delay);
  };

  // 3. 新增取消防抖的方法（可选但实用）
  debounced.cancel = function () {
    clearTimeout(timer);
    timer = null; // 清空定时器标识，避免内存泄漏
  };

  return debounced;
}
```
