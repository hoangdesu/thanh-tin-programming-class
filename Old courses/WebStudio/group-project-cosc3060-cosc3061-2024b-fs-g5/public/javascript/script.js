// Your web app's Firebase configuration
const firebaseConfig = {
    apiKey: "AIzaSyA4ZIB869OFMh8VpGvaneVB61oPaH-ckJE",
    authDomain: "fsg5-b7b9e.firebaseapp.com",
    databaseURL: "https://fsg5-b7b9e-default-rtdb.firebaseio.com",
    projectId: "fsg5-b7b9e",
    storageBucket: "fsg5-b7b9e.appspot.com",
    messagingSenderId: "818329419702",
    appId: "1:818329419702:web:47485cabc14373d22f0b17",
    measurementId: "G-13857Y4WVR"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const auth = firebase.auth();
let recaptchaVerifier;

// --------------------------LoginByGoogle--------------------------------
function loginWithGoogle() {
    const provider = new firebase.auth.GoogleAuthProvider();
    auth.signInWithPopup(provider)
        .then((result) => {
            // Extract user information from the Google login
            const user = {
                uid: result.user.uid,
                email: result.user.email,
                displayName: result.user.displayName,
                photoURL: result.user.photoURL
            };
            // Send the user information to the backend
            fetch('/login-with-google', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(user)
            })
                .then(response => response.json())
                .then(data => {
                    if (data.success) {
                        // Redirect to the homepage after successful session creation
                        window.location.href = '/';
                    } else {
                        console.error('Login failed:', data.message);
                    }
                })
                .catch(error => console.error('Error during login:', error));
        })
        .catch((error) => {
            console.error('Error during signInWithPopup', error);
        });
}

// ---------------------Register------------------------------------------
function checkPassword() {
    const password = document.getElementById('password').value;
    const requirements = document.getElementById('passwordRequirements');

    const minLength = password.length >= 8;
    const hasUppercase = /[A-Z]/.test(password);
    const hasLowercase = /[a-z]/.test(password);
    const hasNumber = /[0-9]/.test(password);
    const hasSpecialChar = /[!@#?$%^&*()_+\-=\[\]{};':"\\|,.\/?]/.test(password);

    let feedback = [];

    if (!minLength) feedback.push("Must be at least 8 characters long");
    if (!hasUppercase) feedback.push("Must contain an uppercase letter");
    if (!hasLowercase) feedback.push("Must contain a lowercase letter");
    if (!hasNumber) feedback.push("Must contain a number");
    if (!hasSpecialChar) feedback.push("Must contain a special character");

    if (feedback.length > 0) {
        requirements.innerHTML = feedback.join('<br>');
    } else {
        requirements.innerHTML = '<span class="text-success">Password meets all requirements!</span>';
    }
}
// ---------------------------ForgetPassword-----------------------------------
function validateResetPasswordForm() {
    const newPassword = document.querySelector('input[name="newPassword"]').value;

    if (!validatePassword(newPassword)) {
        alert("Password does not meet the required criteria.");
        return false;
    }
    return true;
}

// -------------------SetTimeoutOfLogin---------------------------------------
document.addEventListener("DOMContentLoaded", function() {
    const errorMessage = document.getElementById("errorMessage");
    if (errorMessage) {
        setTimeout(() => {
            errorMessage.style.display = "none";
        }, 3000);
    }
});


