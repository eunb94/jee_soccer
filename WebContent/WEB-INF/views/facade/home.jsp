<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"/>
<h2><a id="find2" href="#">2. 포지션 종류 보기</a></h2>
<!--  4. 팀아이디로 해당 팀의 포지션별 선수 검색기능 예) 수원팀(ID: K02), 골키퍼 -->>
	<h2>4. 팀아이디와 포지션 입력하면 해당 선수 정보 출력</h2>
<form id="find4" action="${ctx}/player.do">
		팀아이디<input type="text" name="teamId"/>
		포지션<input type="text" name="position" />
		<input type="hidden" name="action" value="find4" />
		<input type="hidden" name="page" value="4_find_by_teamid_position"/>
		<input type="submit" value="전 송"/>
</form>
<h2>5.수원팀(ID: K02)키가 170 이상 선수이면서 성이 고씨인 선수</h2>
<form id="find5" action="${ctx}/player.do">
		팀아이디<input type="text" name="teamId" />
		키<input type="text" name="height"/>
		이름<input type="text" name="pName"/>
		<input type="hidden" name="action" value="find5" />
		<input type="hidden" name="page" value="5_find_by_teamid_height_name" />
		<input type="submit" value="전 송" />
		
</form>
<script>
$('#find2').click(function(){
	alert=('전송 중');
	location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions');
});

$('#find4').submit(function(){
	alert=('전송 중');

});

$('#find5').submit(function(){
	alert=('전송 중');
});
</script>
<jsp:include page="../common/foot.jsp"/>
