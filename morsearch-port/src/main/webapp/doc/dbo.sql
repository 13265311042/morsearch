/*
Navicat SQL Server Data Transfer

Source Server         : 192.168.11.102-sqlserver
Source Server Version : 105000
Source Host           : 192.168.11.102:1433
Source Database       : testamp
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 105000
File Encoding         : 65001

Date: 2015-10-24 18:31:36
*/


-- ----------------------------
-- Table structure for ly_log
-- ----------------------------
DROP TABLE [dbo].[ly_log]
GO
CREATE TABLE [dbo].[ly_log] (
[id] int NOT NULL IDENTITY(1,1) ,
[accountName] varchar(30) NULL ,
[module] varchar(30) NULL ,
[methods] varchar(200) NULL ,
[actionTime] datetime NULL ,
[userIP] varchar(30) NULL ,
[operTime] datetime NULL ,
[description] text NULL 
)


GO

-- ----------------------------
-- Records of ly_log
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_log] ON
GO
INSERT INTO [dbo].[ly_log] ([id], [accountName], [module], [methods], [actionTime], [userIP], [operTime], [description]) VALUES (N'1', N'0', N'0', N'0', N'2015-10-14 18:22:07.000', N'0', N'2015-10-11 18:22:03.000', N'0')
GO
GO
SET IDENTITY_INSERT [dbo].[ly_log] OFF
GO

-- ----------------------------
-- Table structure for ly_res_user
-- ----------------------------
DROP TABLE [dbo].[ly_res_user]
GO
CREATE TABLE [dbo].[ly_res_user] (
[resId] int NULL ,
[userId] int NULL 
)


GO

-- ----------------------------
-- Records of ly_res_user
-- ----------------------------

-- ----------------------------
-- Table structure for ly_resources
-- ----------------------------
DROP TABLE [dbo].[ly_resources]
GO
CREATE TABLE [dbo].[ly_resources] (
[id] int NOT NULL IDENTITY(1,1) ,
[name] varchar(50) NULL ,
[parentId] int NULL ,
[resKey] varchar(50) NULL ,
[type] varchar(30) NULL ,
[resUrl] varchar(200) NULL ,
[level] int NULL ,
[icon] varchar(100) NULL ,
[ishide] int NULL ,
[description] varchar(200) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[ly_resources]', RESEED, 24)
GO

-- ----------------------------
-- Records of ly_resources
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_resources] ON
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'1', N'系统基础管理', N'0', N'system', N'0', N'system', N'1', N'fa-desktop', N'0', N'系统基础管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'2', N'用户管理', N'1', N'account', N'1', N'/user/list.shtml', N'2', null, N'0', null)
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'3', N'角色管理', N'1', N'role', N'1', N'/role/list.shtml', N'7', N'fa-list', N'0', N'组管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'4', N'菜单管理', N'1', N'ly_resources', N'1', N'/resources/list.shtml', N'12', N'fa-list-alt', N'0', N'菜单管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'5', N'新增用户', N'2', N'account_add', N'2', N'/user/addUI.shtml', N'3', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;addAccount&quot;&nbsp;class=&quot;btn&nbsp;btn-primary&nbsp;marR10&quot;&gt;新增&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'6', N'修改用户', N'2', N'account_edit', N'2', N'/user/editUI.shtml', N'4', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;editAccount&quot;&nbsp;class=&quot;btn&nbsp;btn-info&nbsp;marR10&quot;&gt;编辑&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'7', N'删除用户', N'2', N'account_delete', N'2', N'/user/deleteById.shtml', N'5', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;delAccount&quot;&nbsp;class=&quot;btn&nbsp;btn-danger&nbsp;marR10&quot;&gt;删除&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'8', N'新增角色', N'3', N'role_add', N'2', N'/role/addUI.shtml', N'8', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;addRole&quot;&nbsp;class=&quot;btn&nbsp;btn-primary&nbsp;marR10&quot;&gt;新增&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'9', N'修改角色', N'3', N'role_edit', N'2', N'/role/editUI.shtml', N'9', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;editRole&quot;&nbsp;class=&quot;btn&nbsp;btn-info&nbsp;marR10&quot;&gt;编辑&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'10', N'删除角色', N'3', N'role_delete', N'2', N'/role/delete.shtml', N'10', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;delRole&quot;&nbsp;class=&quot;btn&nbsp;btn-danger&nbsp;marR10&quot;&gt;删除&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'11', N'分配权限', N'3', N'role_perss', N'2', N'/resources/permissions.shtml', N'11', N'无', N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;permissions&quot;&nbsp;class=&quot;btn&nbsp;btn&nbsp;btn-grey&nbsp;marR10&quot;&gt;分配权限&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'12', N'登陆信息管理', N'0', N'ly_login', N'0', N'ly_login', N'21', N'fa-calendar', N'0', N'登陆信息管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'13', N'用户登录记录', N'25', N'ly_log_list', N'1', N'/userlogin/listUI.shtml', N'22', null, N'0', N'用户登录记录')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'14', N'操作日志管理', N'0', N'ly_log', N'0', N'ly_log', N'23', N'fa-picture-o', N'1', N'操作日志管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'15', N'日志查询', N'27', N'ly_log', N'1', N'/log/list.shtml', N'24', null, N'0', N'日志查询')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'16', N'新增菜单资源', N'4', N'ly_resources_add', N'2', N'/resources/addUI.shtml', N'13', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;addFun&quot;&nbsp;class=&quot;btn&nbsp;btn-primary&nbsp;marR10&quot;&gt;新增&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'17', N'修改菜单资源', N'4', N'ly_resources_edit', N'2', N'/resources/editUI.shtml', N'15', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;editFun&quot;&nbsp;class=&quot;btn&nbsp;btn-info&nbsp;marR10&quot;&gt;编辑&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'18', N'删除菜单资源', N'4', N'ly_resources_delete', N'2', N'/resources/delete.shtml', N'14', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;delFun&quot;&nbsp;class=&quot;btn&nbsp;btn-danger&nbsp;marR10&quot;&gt;删除&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'19', N'系统监控管理', N'0', N'monitor', N'0', N'monitor', N'18', N'fa-tag', N'0', N'系统监控管理')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'20', N'实时监控', N'32', N'sysmonitor', N'1', N'/monitor/monitor.shtml', N'19', null, N'0', N'实时监控')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'21', N'分配权限', N'2', N'permissions', N'2', N'/resources/permissions.shtml', N'6', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;permissions&quot;&nbsp;class=&quot;btn&nbsp;btn&nbsp;btn-grey&nbsp;marR10&quot;&gt;分配权限&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'22', N'告警列表', N'32', N'monitor_warn', N'1', N'/monitor/list.shtml', N'20', null, N'0', N'告警列表')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'23', N'上移', N'4', N'lyGridUp', N'2', N'/resources/sortUpdate.shtml', N'16', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;lyGridUp&quot;&nbsp;class=&quot;btn&nbsp;btn-success&nbsp;marR10&quot;&gt;上移&lt;/button&gt;')
GO
GO
INSERT INTO [dbo].[ly_resources] ([id], [name], [parentId], [resKey], [type], [resUrl], [level], [icon], [ishide], [description]) VALUES (N'24', N'下移', N'4', N'lyGridDown', N'2', N'/resources/sortUpdate.shtml', N'17', null, N'0', N'&lt;button&nbsp;type=&quot;button&quot;&nbsp;id=&quot;lyGridDown&quot;&nbsp;class=&quot;btn&nbsp;btn&nbsp;btn-grey&nbsp;marR10&quot;&gt;下移&lt;/button&gt;')
GO
GO
SET IDENTITY_INSERT [dbo].[ly_resources] OFF
GO

-- ----------------------------
-- Table structure for ly_role
-- ----------------------------
DROP TABLE [dbo].[ly_role]
GO
CREATE TABLE [dbo].[ly_role] (
[id] int NOT NULL IDENTITY(1,1) ,
[state] varchar(3) NULL ,
[name] varchar(50) NULL ,
[roleKey] varchar(50) NULL ,
[description] varchar(50) NULL 
)


GO

-- ----------------------------
-- Records of ly_role
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_role] ON
GO
SET IDENTITY_INSERT [dbo].[ly_role] OFF
GO

-- ----------------------------
-- Table structure for ly_server_info
-- ----------------------------
DROP TABLE [dbo].[ly_server_info]
GO
CREATE TABLE [dbo].[ly_server_info] (
[id] int NOT NULL IDENTITY(1,1) ,
[cpuUsage] varchar(100) NULL ,
[setCpuUsage] varchar(100) NULL ,
[jvmUsage] varchar(100) NULL ,
[setJvmUsage] varchar(100) NULL ,
[ramUsage] varchar(100) NULL ,
[setRamUsage] varchar(100) NULL ,
[email] varchar(30) NULL ,
[operTime] datetime NULL ,
[mark] varchar(300) NULL 
)


GO

-- ----------------------------
-- Records of ly_server_info
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_server_info] ON
GO
SET IDENTITY_INSERT [dbo].[ly_server_info] OFF
GO

-- ----------------------------
-- Table structure for ly_user
-- ----------------------------
DROP TABLE [dbo].[ly_user]
GO
CREATE TABLE [dbo].[ly_user] (
[id] int NOT NULL IDENTITY(1,1) ,
[userName] varchar(30) NULL ,
[accountName] varchar(30) NULL ,
[password] varchar(50) NULL ,
[credentialsSalt] varchar(100) NULL ,
[description] varchar(100) NULL ,
[locked] varchar(3) NULL ,
[createTime] datetime NULL ,
[deletestatus] varchar(1) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[ly_user]', RESEED, 4)
GO

-- ----------------------------
-- Records of ly_user
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_user] ON
GO
INSERT INTO [dbo].[ly_user] ([id], [userName], [accountName], [password], [credentialsSalt], [description], [locked], [createTime], [deletestatus]) VALUES (N'2', N'蓝缘', N'simple', N'78e21a6eb88529eab722793a448ed394', N'4157c3feef4a6ed91b2c28cf4392f2d1', N'0', N'1', N'2015-05-17 22:23:15.000', N'0')
GO
GO
INSERT INTO [dbo].[ly_user] ([id], [userName], [accountName], [password], [credentialsSalt], [description], [locked], [createTime], [deletestatus]) VALUES (N'3', N'超级管理员', N'ROOT', N'78e21a6eb88529eab722793a448ed394', N'4157c3feef4a6ed91b2c28cf4392f2d1', N'0000', N'1', N'2015-05-23 17:39:37.000', N'0')
GO
GO
INSERT INTO [dbo].[ly_user] ([id], [userName], [accountName], [password], [credentialsSalt], [description], [locked], [createTime], [deletestatus]) VALUES (N'4', N'管理员', N'admin', N'78e21a6eb88529eab722793a448ed394', N'4157c3feef4a6ed91b2c28cf4392f2d1', N'3434', N'1', N'2015-05-23 17:39:39.000', N'0')
GO
GO
SET IDENTITY_INSERT [dbo].[ly_user] OFF
GO

-- ----------------------------
-- Table structure for ly_user_role
-- ----------------------------
DROP TABLE [dbo].[ly_user_role]
GO
CREATE TABLE [dbo].[ly_user_role] (
[userId] int NULL ,
[roleId] int NULL 
)


GO

-- ----------------------------
-- Records of ly_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for ly_userlogin
-- ----------------------------
DROP TABLE [dbo].[ly_userlogin]
GO
CREATE TABLE [dbo].[ly_userlogin] (
[id] int NOT NULL IDENTITY(1,1) ,
[userId] int NULL ,
[accountName] varchar(30) NULL ,
[loginTime] datetime NULL ,
[loginIP] varchar(30) NULL 
)


GO

-- ----------------------------
-- Records of ly_userlogin
-- ----------------------------
SET IDENTITY_INSERT [dbo].[ly_userlogin] ON
GO
SET IDENTITY_INSERT [dbo].[ly_userlogin] OFF
GO

-- ----------------------------
-- Indexes structure for table ly_log
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_log
-- ----------------------------
ALTER TABLE [dbo].[ly_log] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table ly_resources
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_resources
-- ----------------------------
ALTER TABLE [dbo].[ly_resources] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table ly_role
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_role
-- ----------------------------
ALTER TABLE [dbo].[ly_role] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table ly_server_info
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_server_info
-- ----------------------------
ALTER TABLE [dbo].[ly_server_info] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table ly_user
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_user
-- ----------------------------
ALTER TABLE [dbo].[ly_user] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table ly_userlogin
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table ly_userlogin
-- ----------------------------
ALTER TABLE [dbo].[ly_userlogin] ADD PRIMARY KEY ([id])
GO
