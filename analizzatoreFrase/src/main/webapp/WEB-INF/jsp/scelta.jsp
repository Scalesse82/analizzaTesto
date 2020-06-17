<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <form action="controlloVocaboli" method="post">
   conta vocaboli<br>
  <input type="submit" value="conta"><br>
  <input type="hidden"  name="testo" value="${testo}">
  
 </form>
 
 <form action="controlloVocali" method="post">
   conta vocali<br>
  <input type="submit" value="conta"><br>
  <input type="hidden"  name="testo" value="${testo}">
  
 </form>
 
 <form action="controlloConsonanti" method="post">
   conta consonanti<br>
  <input type="submit" value="conta"><br>
   <input type="hidden"  name="testo" value=" ${testo}">

 </form>

</body>
</html>