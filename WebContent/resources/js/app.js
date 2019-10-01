
var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login();
			
			$('#a_join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx+'/player.do?action=move&page=join');
			});
			$('#back').click(()=>{
				alert('로그인 이동');
				location.assign(ctx+'/player.do?action=move&page=login');
			});
		}
			
	};
})();
/* pId, pName, ePlayerName, nickName, joinY, position, nation, solar, height, weight, backNo, bDate, teamId; */

var player = (()=>{
	var _pId, _pName, _ePlayerName, _nickName, _joinY, _position, _nation, 
	_solar, _height, _weight, _backNo, _bDate, _teamId;
	var setPId = (pId)=>{this._pId = pId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPId = ()=>{return this._pId;}
	var getSolar = ()=>{return this._solar;}
	return{
		setPId : setPId,
		setSolar : setSolar,
		getPId : getPId,
		getSolar : getSolar
		
	};
})();
var playerService = (()=>{
	return {
		login: ()=>{
			$('#login_btn').click(()=>{		
				if($('#username').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값 : '+$('#username').val());
					$('#login_form').attr('action', '/jee-soccer/player.do');
					$('#login_form').submit();
						
				}
				
			});
		}
	};
})();

