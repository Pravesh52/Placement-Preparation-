
const bcrypt = require("bcryptjs");
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter your password: ", async (password) => {
  try {
    const hashedPassword = await bcrypt.hash(password, 10);

    console.log("\nBcrypt Hash:");
    console.log(hashedPassword);
  } catch (error) {
    console.log("Error:", error.message);
  } finally {
    rl.close();
  }
});
