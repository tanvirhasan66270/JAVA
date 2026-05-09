
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8f9fa; }
        .form-container { max-width: 500px; margin-top: 50px; }
        .card { border-radius: 15px; border: none; }
        .card-header { border-radius: 15px 15px 0 0 !important; }
    </style>
</head>
<body>

<div class="container d-flex justify-content-center form-container">
    <div class="card shadow-lg w-100">
        <div class="card-header bg-primary text-white text-center py-3">
            <h4 class="mb-0">Student Registration Form</h4>
        </div>
        <div class="card-body p-4">
            
            <form action="StudentServlet" method="POST">
                
                <input type="hidden" name="action" value="add"/>

              
                <div class="mb-3">
                    <label class="form-label fw-bold">Name</label>
                    <input type="text" class="form-control" name="name" placeholder="Enter full name" required>
                </div>

                <div class="mb-3">
                    <label class="form-label fw-bold">Subject</label>
                    <input type="text" class="form-control" name="subject" placeholder="Enter subject name" required>
                </div>

                
                <div class="mb-3">
                    <label class="form-label fw-bold">Student Marks</label>
                    <input type="number" class="form-control" name="marks" placeholder="Enter marks" required>
                </div>

               
                <div class="mb-4">
                    <label class="form-label fw-bold">Departments</label>
                    <input type="text" class="form-control" name="departments" placeholder="Enter department" required>
                </div>

               
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary btn-lg shadow-sm">Save Information</button>
                </div>
            </form>

        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>