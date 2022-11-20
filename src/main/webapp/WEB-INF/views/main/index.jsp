<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- cdn link -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" 
integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" 
integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>

</head>

<body>



<!---------------------- main 시작 --------------------------------------------------------------------------------------------->
<div id="main">

  <svg xmlns="http://www.w3.org/2000/svg" width="1921" height="526" viewBox="0 0 1921 526">
      <g id="List_Group_Item_heading_Center" data-name="List Group/Item heading/Center" transform="translate(0.5 0.5)">
          <rect id="State" width="1920" height="525" fill="#ced4da" stroke="#ced4da" stroke-width="1"/>
          <g id="content" transform="translate(16 167.778)">
              <text id="Donec_id_elit_non_mi_porta." data-name="Donec id elit non mi porta." transform="translate(0 68.222)" fill="#ced4da" font-size="13" font-family="ArialMT, Arial"><tspan x="0" y="0">Donec id elit non mi porta.</tspan></text>
              <g id="header">
                  <text id="List_group_item_heading" data-name="List group item heading" transform="translate(0 40.222)" fill="#ced4da" font-size="20" font-family="SegoeUI, Segoe UI"><tspan x="0" y="0">List group item heading</tspan></text>
                  <text id="_3_days_ago" data-name="3 days ago" transform="translate(1880 37.222)" fill="#ced4da" font-size="13" font-family="ArialMT, Arial"><tspan x="-63.604" y="0">3 days ago</tspan></text>
              </g>
          </g>
          <text id="대표이미지" transform="translate(191 258)" fill="#6c757d" font-size="30" font-family="MalgunGothic, Malgun Gothic"><tspan x="-75" y="0">대표이미지</tspan></text>
      </g>
  </svg>

	<div id="cards row">
	
		<div class="container">
		    <div class="row my-10">
		    
		        <div class="col-4">
		            <div class="card" style="width: 18rem;">
		                <img src="https://picsum.photos/300/200" class="card-img-top" alt="...">
		                <div class="card-body">
		                  <h5 class="card-title">Card title</h5>
		                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		                  <a href="#" class="btn btn-outline-secondary">Go somewhere</a>
		                </div>
		            </div>
		        </div>
		        
		      	<div class="col-4">
		            <div class="card" style="width: 18rem;">
		                <img src="https://picsum.photos/300/200" class="card-img-top" alt="...">
		                <div class="card-body">
		                  <h5 class="card-title">Card title</h5>
		                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		                  <a href="#" class="btn btn-outline-secondary">Go somewhere</a>
		                </div>
		            </div>
		        </div>
		        
		        
		       	<div class="col-4">
		            <div class="card" style="width: 18rem;">
		                <img src="https://picsum.photos/300/200" class="card-img-top" alt="...">
		                <div class="card-body">
		                  <h5 class="card-title">Card title</h5>
		                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		                  <a href="#" class="btn btn-outline-secondary">Go somewhere</a>
		                </div>
		            </div>
		        </div>
		        
		  	</div>
		</div>
	
		<div class="container">
		    <div class="row">
		        <div class="col-4">
		            <div class="card" style="width: 18rem;">
		                <img src="https://picsum.photos/300/200" class="card-img-top" alt="...">
		                <div class="card-body">
		                  <h5 class="card-title">Card title</h5>
		                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		                  <a href="#" class="btn btn-outline-secondary">Go somewhere</a>
		                </div>
		            </div>
		        </div>
		  </div>
		</div>
	
		<div class="container">
		    <div class="row">
		        <div class="col-4">
		            <div class="card" style="width: 18rem;">
		                <img src="https://picsum.photos/300/200" class="card-img-top" alt="...">
		                <div class="card-body">
		                  <h5 class="card-title">Card title</h5>
		                  <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
		                  <a href="#" class="btn btn-outline-secondary">Go somewhere</a>
		                </div>
		            </div>
		        </div>
		      </div>
		   </div>
		   	
	</div>


</div>              

<!---------------------- main 종료 --------------------------------------------------------------------------------------------->


<!---------------------- footer 시작 --------------------------------------------------------------------------------------------->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
<!---------------------- footer 종료 --------------------------------------------------------------------------------------------->
</body>
</html>