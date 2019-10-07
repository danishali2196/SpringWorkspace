<%@page import="java.util.*"%>
<%List<Map<String,Object>> list=(List<Map<String,Object>>)request.getAttribute("result");
if (list!=null){%>
	<<table>
  <tr>
    <th>NO</th>
    <th>Name</th>
    <th>Job</th>
    <th>Salary</th>
  </tr>
  <%for(Map map:list){ %>
  <tr>
    <td><%=map.get("EMPNO") %></td>
    <td><%=map.get("ENAME") %></td>
    <td><%=map.get("JOB") %></td>
    <td><%=map.get("SAL") %></td>
  </tr>
  <%}  
	}%>
</table>