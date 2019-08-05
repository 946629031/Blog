![alt text](http://cdn.biaoyansu.com/TQDj8Uo1pj3YkMSoeSitYC1QB4a019V68N6GZFBE.png)

# 0.初始化

## 0.1 基本信息配置
    git config --global user.name "threeki"
    git config --global user.email 946629031@qq.com
    git config user.name
    git config user.email
    git config --list	#查看当前已经配置了的项目信息

## 0.2 本地仓库初始化
    git init

    git status  #查看本地仓库状态(看有哪些没被提交的文件)

## 0.3 将本地仓库与远程仓库关联
    git remote add origin https://github.com/仓库地址	#将本地仓库与远程仓库关联
    #git remote add 远程名称 远程地址	#master是默认分支名称   origin是默认远程仓库名称
        git remote    	 #列出所有远程仓库
        git remote -v    #列出所有远程仓库的详细信息
    1. 修改命令
    git remote set-url origin <URL> 更换远程仓库地址。把<URL>更换为新的url地址。
    2.先删后加
    git remote rm origin 	
    git remote add origin git@github.com:Liutos/foobar.git 



# 1. 提交

    git add .
    git add fileName        #添加指定文件
    git commit -m"备注文字内容"		#添加到本地仓库

    #每次更新都要add，添加到本地缓冲区(staged)

    git commit -am "change 3 in dev"
    该命令相当于 git add . && git commit -m "change 3 in dev"
    但是该命令仅对于已经 add 过的文件有效




git diff
查看两个文件不同的地方

git log --oneline --graph
在一行上输出日志，并用图形的方式来表示

git checkout -b dev
新建 dev 分支的同时，切换到 dev 分支上

git checkout master
切换到master分支上

git merge dev
将dev分支合并到你现在的分支(master)

git merge --no-ff -m "keep merge info" dev
将dev分支合并到你现在的分支(master)，并且留下"keep merge info"的信息


# git branch 新建分支

git branch
查看有多少个分支

git branch dev
创建新的分支 dev

git branch -d dev
删除分支，删除前请确认你切换在其他分支上



<hr>
# 表严肃

## 配置
    git config --global user.name "<姓名>" 设置提交者姓名。
    git config --global user.email "<邮箱>" 设置提交者邮箱。

## 基础操作
    git init [目录名] 在指定目录创建仓库，如果没有指定目录名将在当前目录创建仓库。
    git clone <远程仓库地址> [目录名] 从指定地址克隆仓库，若不指定目录名将默认创建与远程同名目录。
    git add <目录名|文件名> 将文件或目录中已修改的代码添加追暂存区。
    git commit -m "<注释>" 提交暂存区内容。
    git status 查看仓库状态

## 比对 diff
    git diff 比对当前内容和暂存区内容。
    git diff HEAD 比对当前内容和最近一次提交。
    git diff HEAD^ 比对当前内容和倒数第二次提交。
    git diff HEAD^ HEAD 比对最近两次提交。

## 历史 log
    git log [--oneline] [--all] 查看提交历史。
    git log --oneline 打印为单行log。
    git log --all 打印所有记录（忽略HEAD的位置）。
    git log --graph 打印示意图（忽略HEAD的位置）。

## 分支 branch
    git branch [分支] 有分支：创建分支，无分支：列出所有分支。
    git checkout <分支> 切换至分支。
    git checkout -b <分支> 创建并切换至分支分支。
    git merge <分支> 将分支与当前分支合并。

## 远程
    git pull 拉取远程仓库。
    git push <远程仓库> <分支> 推送至远程仓库。
    git remote add origin https://xxx.git 新增远程仓库origin
    git remote set-url origin https://xxx.git 修改远程仓库origin


表严肃视频讲解 http://biaoyansu.com/27.9