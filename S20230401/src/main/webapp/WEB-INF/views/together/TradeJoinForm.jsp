<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../preset.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js" ></script>

</head>
<body>
<h2>거래 신청하기</h2>

    <form action="${pageContext.request.contextPath }/board/ArticleReport" method="POST">  
        <input type="hidden" name="art_id" value="${article.art_id}">
        <input type="hidden" name="brd_id" value="${article.brd_id}">
        <input type="hidden" name="mem_id" value="${memberInfo.mem_id}">
        <table class="주의사항" border="1">
            <tr>
                <th>주의사항</th>
            </tr>
            <tr>
                <td width="500" height="200">내용</td>
			</tr>
        </table>    
        		
        <br>
            
        <table class="거래내역확인" border="1">
            <tr>
            	<th colspan="2" width = "500">거래내역확인</th>
            </tr>
            <tr>
            	<th>제목</th>
            	<td>${article.art_content }</td>
            </tr>
            <tr>
            	<th>지역제한</th>
            	<td>${article.reg_name }</td>
            </tr>
            <tr>
            	<th>장소</th>
            	<td>${article.trd_loc }</td>
            </tr>
			<tr>
				<th>인원수</th>
				<td>${article.trd_max }</td>
			</tr>
            <tr>
				<th>성별</th>
				<td>
				<c:set var="gender" value ="${article.c2_comm_id }"/>
				<c:choose>
					<c:when test="${gender eq 201 }">남성</c:when>
					<c:when test="${gender eq 202 }">여성</c:when>
					<c:otherwise>성별무관</c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>
				<th>최소나이</th>
				<td>${article.trd_minage }</td>
			</tr>
			<tr>
				<th>최대나이</th>
				<td>${article.trd_maxage }</td>
			</tr>		
        </table>
        <br>	
               
               <span>위 내용에 대해 동의하시겠습니까?</span>
               <label>동의   <input  type="radio"  class = "TradeAgree" name="TradeCheck"></label>
               <label>비동의<input  type="radio"  class = "TradeDisagree" name="TradeCheck" checked></label>
               <br>
               <br>
               <button type="button" class="Trade_submit">신청하기</button>
               <button type="button" class="Trade_cancel">취소하기</button>
    </form>
    
</body>
</html>