<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>
<%@include file="../includes/subnav_admin.jsp" %>

<div class="wrapper">

    <%--    SIDEBAR GOES HERE--%>
<%@include file="element_sidebar.jsp" %>

        <div id="main-wrapper" class="col-md-11 pull-right">
            <div class="col-lg-8 col-md-7 col-sm-6">

<%--                LIST OF EXISTING ELEMENTS--%>
                <table class="table table-striped table-hover">
                    <thead>
                        <th>ID</th>
                        <th>Element Type</th>
                        <th>Elements</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </thead>
                    <tbody>
                        <c:forEach var="elementType" items="${elementTypeList}">
                            <tr>
                                <td>${elementType.id}</td>
                                <td>${elementType.elementType}</td>
                                <td>Elements will go here...</td>
                                <td>Edit</td>
                                <td>Delete</td>

                            </tr>
                        </c:forEach>
                    </tbody>

                </table>

            </div>
        </div>
</div>

<%@include file="../includes/footer.jsp" %>
