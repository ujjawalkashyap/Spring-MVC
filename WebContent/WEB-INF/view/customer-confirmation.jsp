<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>

<head>
	<title>
		Customer Confirmation Page
	</title>
</head>

<body>

The Customer is confirmed ${customer.firstName} ${customer.lastName}
<br> <br>
Free Passes: ${customer.freePasses}

<br> <br>
Postal code: ${customer.postalCode}
</body>

</html>