// Get today's date
var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
var yyyy = today.getFullYear();
var maxDate = new Date(today.getTime() + 30 * 24 * 60 * 60 * 1000); // 30 days later

today = yyyy + '-' + mm + '-' + dd;
maxDate = maxDate.toISOString().split('T')[0]; // Convert maxDate to YYYY-MM-DD format

// Set min and max attributes for date input
document.getElementById("date").setAttribute("min", today);
document.getElementById("date").setAttribute("max", maxDate);