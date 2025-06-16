document.querySelector('form').addEventListener('submit', function (event) {
    let isValid = true;

    // Clear old error messages
    document.getElementById("materialError").innerText = "";
    document.getElementById("weightError").innerText = "";
    document.getElementById("sizeError").innerText = "";
    document.getElementById("priceError").innerText = "";
    document.getElementById("dateError").innerText = "";

    // Get values
    const material = document.getElementById("material").value.trim();
    const weight = parseFloat(document.getElementById("weight").value.trim());
    const size = parseFloat(document.getElementById("size").value.trim());
    const price = parseFloat(document.getElementById("price").value.trim());
    const purchaseDateStr = document.getElementById("purchaseDate").value;

    // Material validation
    if (!material) {
        document.getElementById("materialError").innerText = "Material is required.";
        isValid = false;
    }

    // Weight validation
    if (isNaN(weight) || weight === 0) {
        document.getElementById("weightError").innerText = "Weight must be non-zero.";
        isValid = false;
    }

    // Size validation
    if (isNaN(size) || size < 2) {
        document.getElementById("sizeError").innerText = "Size must be at least 2.";
        isValid = false;
    }

    // Price validation
    if (isNaN(price) || price <= 1000) {
        document.getElementById("priceError").innerText = "Price must be greater than 1000.";
        isValid = false;
    }

    // Purchase Date validation
    if (!purchaseDateStr) {
        document.getElementById("dateError").innerText = "Purchase date is required.";
        isValid = false;
    } else {
        const purchaseDate = new Date(purchaseDateStr);
        const today = new Date();
        today.setHours(0, 0, 0, 0); // Set time to midnight for comparison

        if (purchaseDate > today) {
            document.getElementById("dateError").innerText = "Purchase date cannot be in the future.";
            isValid = false;
        }
    }

    // Prevent form submission if validation fails
    if (!isValid) {
        event.preventDefault();
    }
});
