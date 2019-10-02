<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div></div><div><h2>4. 팀아이디와 포지션 입력하면 해당 선수 정보 출력</h2></div><div></div>
<div></div>
<form id="teamid_position_form_q">
		<div>팀아이디<input type="text" name="teamId"/></div>
		<div>포지션<input type="text" name="position" /></div>
		<div><input id="team_position_btn" type="button" value="확인" /></div>
		<div><input type="hidden" name="action" value="login" /></div>
		<div><input type="hidden" name="page" value="4_find_by_teamid_position"/></div>
		<div><input type="submit" value="전 송"/></div><div></div>
</form>
<div></div><div></div><div></div>

<script>
app.init('${ctx}');
</script>