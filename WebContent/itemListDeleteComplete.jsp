<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>ItemListDeleteComplete画面</title>

<style type="text/css">

body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}
table{
text-align:center;
margin:0 auto;
}

#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}

#header{
list-style:none;
color:white;
width:100%;
height:50px;
background-color:black;
font-size:30px;
text-align:right;
}
#main{
width:100%;
height:500px;
text-align:center;
}
#footer{
width:100%;
height:80px;
background-color:black;
clear-both;
}
#text-center{
display:inline-block;
text-align:center;
}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemListDeleteComplete</p>
		</div>
		<div>
			<s:if test="itemInfo == null">
				<h3>削除が完了しました。<br/>商品情報はありません。</h3>
			</s:if>

				<div id="text-right">
					<p>管理者画面は<a href='<s:url action="AdminAction" />'>こちら</a></p>
					<p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
				</div>
	</div>
</div>
<div id="footer">
	<div id="pr">
	</div>
</div>
</body>

</html>