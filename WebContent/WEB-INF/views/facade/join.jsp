<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- pId, pName, ePlayerName, nickName, joinY, position, nation, solar, height, weight, backNo, bDate, teamId; -->
<div></div>
    <div id = "join_name"><h3>회원가입</h3></div>
    <div></div>
    <div></div>
    <form id = "join_form">
    <div id = "join_text" >
        <div>playerId</div>
        <div class = "input_join"><input id="join_pId" type="text" name = "pId" /></div>
        <div>playerName</div>
        <div class = "input_join"><input id="join_pName" type="text" name = "pName"/></div>
        <div>teamId</div>
        <div class = "input_join"><input id="join_teamId" type="text" name = "teamId" /></div>
        <div>ePlayerName</div>
        <div class = "input_join"><input id="join_ePlayerName" type="text" name = "ePlayerName" /></div>
        <div>nickName</div>
        <div class = "input_join"><input id="join_nickName" type="text" name = "nickName" /></div>
        <div>joinYyyy</div>
        <div class = "input_join"><input id="join_joinY" type="text" name = "joinY" /></div>
        <div>position</div>
        <div class = "input_join"><input id="join_position" type="text" name = "position" /></div>
        <div>backNo</div>
        <div class = "input_join"><input id="join_backNo" type="text" name = "backNo" /></div>
        <div>nation</div>
        <div class = "input_join"><input id="join_nation" type="text" name = "nation" /></div>
        <div>birthDate</div>
        <div class = "input_join"><input id="join_bDate" type="text" name = "bDate" /></div>
        <div>solar</div>
        <div class = "input_join"><input id="join_solar" type="text" name = "solar" /></div>
        <div>height</div>
        <div class = "input_join"><input id="join_height" type="text" name = "height" /></div>
        <div>weight</div>
        <div class = "input_join"><input id="join_weight" type="text" name = "weight" /></div>
    </div>
    <div></div>
    <div><h3><input id="join_btn" type="button" value = "가입하기"  /></h3></div>
<div><h3><a id="back" href="#">뒤로가기</a></h3></div>

    <input type="hidden" name = "action" value = "create" />
    <input type="hidden" name = "page" value = "login" />

</form>
<script>
app.init('${ctx}');
</script>
