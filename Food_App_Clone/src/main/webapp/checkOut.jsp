<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkout</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f5f5f5;
        }
        .checkout-box {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .summary-box {
            background-color: #f8f9fa;
            padding: 20px;
            border-radius: 10px;
        }
        .btn-place-order {
            width: 100%;
            background-color: #28a745;
            color: white;
        }
        .btn-place-order:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container mt-5 mb-5">
        <div class="row">
            <!-- Billing Details -->
            <div class="col-md-7">
                <div class="checkout-box">
                    <h3>Billing Information</h3>
                    <form action="PlaceOrderServlet" method="post">
                        <div class="mb-3">
                            <label class="form-label">Full Name</label>
                            <input type="text" class="form-control" name="fullname" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Phone Number</label>
                            <input type="tel" class="form-control" name="phone" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email Address</label>
                            <input type="email" class="form-control" name="email" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Shipping Address</label>
                            <textarea class="form-control" name="address" rows="3" required></textarea>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Payment Method</label>
                            <select class="form-select" name="paymentMethod" required>
                                <option value="COD">Cash On Delivery</option>
                                <option value="UPI">UPI</option>
                                <option value="Card">Credit/Debit Card</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-place-order">Place Order</button>
                    </form>
                </div>
            </div>

            <!-- Order Summary -->

        </div>
    </div>
</body>
</html>
