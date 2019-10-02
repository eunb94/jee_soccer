
var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.moveJoin(ctx);
			playerService.position(ctx);
			playerService.teamPosition(ctx);
			
			$('#back_position').click(()=>{
				alert('플레이어 메인 이동');
				location.assign(ctx+'/player.do?action=login&page=main');
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
		login: (ctx)=>{
			$('#login_btn').click(()=>{		
				if($('#username').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값 : '+$('#username').val());
					$('#login_form').attr('action', ctx+'/player.do');
					$('#login_form').attr('method','POST');
					$('#login_form').submit();
						
				}
				
			});
		},
		join : (ctx)=>{
			$('#join_btn').click(()=>{
				if($('join_pId').val()==='' ||
						$('#join_solar').val()===''){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값 : '+$('#join_pId').val());
					$('#join_form').attr('action', ctx+'/player.do');
					$('#join_form').attr('method','POST');
					$('#join_form').submit();
						
				}
			});
		},
		moveJoin: (ctx)=>{
			$('#a_join').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
		},
		position : (ctx)=>{
			$('#q_position').click(()=>{
				location.assign(ctx+'/player.do?action=search&page=2_positions_a');
			});
		},
		teamPosition: (ctx)=>{
			$('#team_position_btn').click(()=>{
				
			});
		}
	
	};
})();

