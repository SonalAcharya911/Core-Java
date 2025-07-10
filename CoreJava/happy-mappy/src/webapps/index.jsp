<html>
<head>
    <title>
        quiz
    </title>
</head>
<body>
<form action="quiz" method="post">
    question 1 ${answer1}
    <select class="form-select" aria-label="Default select example" name="ans1">
        <option selected>Open this select menu</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
    </select>
    <br>
    <br>

    question 2 ${answer2}
    <select class="form-select" aria-label="Default select example" name="ans2">
        <option selected>Open this select menu</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
    </select>


    <br>
    <br>

    question 3 ${answer3}
    <select class="form-select" aria-label="Default select example" name="ans3">
        <option selected>Open this select menu</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
    </select>

    <input type="submit" value="submit">
</form>

</body>
</html>