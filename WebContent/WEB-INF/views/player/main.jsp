<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c2" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../common/head.jsp"/>

<div class="container2">
</div><div></div><h1>플레이어 메인</h1><div></div>
<div></div>
<div class="content2"></div>
<jsp:include page="2_positions_q.jsp"/>
<div>
<c2:choose>
<c2:when test="${page eq '2_positions_q'}">
<jsp:include page="2_positions_q.jsp"/>
</c2:when>
	<c2:when test="${page eq '2_positions_a'}">
	<jsp:include page="2_positions_a.jsp"/>
	</c2:when>
	<c2:when test="${page eq '4_find_by_teamid_position_q'}">
	<jsp:include page="4_find_by_teamid_position_q.jsp"/>
	</c2:when>
	<c2:when test="${page eq '4_find_by_teamid_position_a'}">
	<jsp:include page="4_find_by_teamid_position_a.jsp"/>
	</c2:when>
</c2:choose>
</div>
<div></div><div></div><div></div>


<jsp:include page="../common/foot.jsp"/>