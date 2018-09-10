<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>客户列表</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(function(){
	// 页面加载函数就会执行：
	// 页面加载，异步查询字典数据：
	// 加载客户来源
	$.post("${pageContext.request.contextPath }/findByKindCode.action",{"kind_code":"01"},function(data){
		// 遍历json的数据:
		$(data).each(function(i,n){
			$("#pay_kind").append("<option value='"+n.kind_id+"'>"+n.kind_item+"</option>");
		});
		
			//EL表达式，获取值栈的数据
		$("#pay_kind option[value='${model.moneyKind.kind_id}']").prop("selected","selected");
			
		},"json");
		
	});

</script>
<SCRIPT language=javascript>
	function to_page(page){
		if(page){
			$("#page").val(page);
		}
		document.customerForm.submit();
		
	}
</SCRIPT>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id="customerForm" name="customerForm"
		action="${pageContext.request.contextPath }/payFindAll.action"
		method=post>
		
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：账务管理 &gt; 支出列表</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0
							width="100%" align=center border=0>
							<TBODY>
								<TR>
									<TD height=25>
										<TABLE cellSpacing=0 cellPadding=2 border=0>
											<TBODY>
												<TR>
													<TD>支出种类：</TD>
													<TD>
														<select id="pay_kind" name="pay_kind">
															<option value="">-请选择-</option>
														</select>
													</TD>
													<TD><INPUT class=button id=sButton2 type=submit
														value=" 筛选 " name=sButton2></TD>
												</TR>
											</TBODY>
										</TABLE>
									</TD>
								</TR>
							    
								<TR>
									<TD>
										<TABLE id=grid
											style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
											cellSpacing=1 cellPadding=2 rules=all border=0>
											<TBODY>
												<TR
													style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
													<TD>支出时间</TD>
													<TD>支出种类</TD>
													<TD>支出金额</TD>
													<TD>备注</TD>
													<TD>操作</TD>
												</TR>
												<c:forEach items="${pageBean.list}" var="payVo">
												
												<TR
													style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
													<TD>${payVo.pay_time}</TD>
													<TD>${payVo.kind_item}</TD>
													<TD>${payVo.pay_money}</TD>
													<TD>${payVo.pay_memo}</TD>
													<TD>
													<a href="${pageContext.request.contextPath }/payEdit.action?pay_id=${payVo.pay_id}">修改</a>
													&nbsp;&nbsp;
													<a href="${pageContext.request.contextPath }/payDelete.action?pay_id=${payVo.pay_id}">删除</a>
													</TD>
												</TR>
									      </c:forEach>
											</TBODY>
										</TABLE>
									</TD>
								</TR>
								
								<TR>
									<TD><SPAN id=pagelink>
											<DIV style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
												共[<B>${pageBean.totalCount}</B>]条记录,[<B>${pageBean.totalPage}</B>]页
												,每页显示
												<select name="pageSize" onchange="to_page()">
												
												<option value="3" <c:if test="${pageBean.pageSize==3}">selected</c:if>>3</option>
												<option value="5" <c:if test="${pageBean.pageSize==5}">selected</c:if>>5</option>
												<option value="10" <c:if test="${pageBean.pageSize==10}">selected</c:if>>10</option>
												</select>
												条
												<c:if test="${pageBean.currPage != 1}">
												[<A href="javascript:to_page(1)">首页</A>]
												[<A href="javascript:to_page(${pageBean.currPage-1})">前一页</A>]
												</c:if>&nbsp;&nbsp;
												<B>
												<c:forEach var="i" begin="1" end="${pageBean.totalPage}">
												<c:if test="${i == pageBean.currPage}">
													${i}
												</c:if>
														<a href="javascript:to_page(${i})">${i}</a>
												</c:forEach>
												</B>&nbsp;&nbsp;
												<c:if test="${pageBean.currPage != pageBean.totalPage}">
												[<A href="javascript:to_page(${pageBean.currPage+1})">后一页</A>] 
												[<A href="javascript:to_page(${pageBean.totalPage})">末页</A>] 
												</c:if>
												到
												<input type="text" size="3" id="page" name="currPage" />
												页
												
												<input type="button" value="Go" onclick="to_page()"/>
											</DIV>
									</SPAN></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
