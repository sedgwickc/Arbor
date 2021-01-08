<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<div class="container">
	<div class="row">
	 <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-primary">
        <div class="panel panel-heading">Add Soil</div>
        <div class="panel-body">
         <form:form method="post" modelAttribute="soil">
          <fieldset class="form-group">
           <form:label path="name">Name</form:label>
           <form:input path="name" type="text" class="form-control" required="required"/>
           <form:errors path="name" cssClass="text-warning" />
          </fieldset>
          <fieldset class="form-group">
           <form:label path="description">Description</form:label>
           <form:input path="description" type="text" class="form-control" required="required" />
           <form:errors path="description" cssClass="text-warning"/>
          </fieldset>
          <fieldset class="form-group">
           <form:label path="drainage">Drainage</form:label>
           <form:input path="drainage" type="text" class="form-control" required="required" />
           <form:errors path="drainage" cssClass="text-warning"/>
          </fieldset>
          
          <button type="submit" class="btn btn-success">Save</button>
         </form:form>
        </div>
       </div>
      </div>   
    </div>
</div>

<%@ include file="common/footer.jspf" %>