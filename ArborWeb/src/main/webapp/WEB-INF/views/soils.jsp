<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-soil">Add Soil</a>
    </div>    
    <div class="panel panel-primary">
        <div class="panel panel-heading">
            <h3>Available Soils</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
             <thead>
              <tr>
               <th width="20%">Name</th>
               <th width="60%">Description</th>
               <th width="20%">Drainage</th>
              </tr>
             </thead>
             <tbody>
              <c:forEach items="${soils}" var="soil">
               <tr>
                <td>${soil.name}</td>
                <td>${soil.description}</td>
                <td>${soil.drainage}
               </tr>
              </c:forEach>
             </tbody>
            </table>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf" %>