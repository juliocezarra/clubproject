<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <link rel="icon" href="img/clube.svg"/>
        <link rel="stylesheet" href="css/style.css"/>
        <title>ClubSocial</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Bem vindo <%= request.getAttribute("userLogged") %>!</h1>
    </body>
</html>
