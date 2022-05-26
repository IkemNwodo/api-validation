# Rest API validation

This is a spring boot rest api project that does an extra check(frontend obviously the first) and validates request object being sent to the server.
This is done by setting constraints to class fields of the incoming request object. When any constraint is not met, error is thrown and the right message is returned with the help of @ExceptionHandler