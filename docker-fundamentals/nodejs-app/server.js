const http = require("http");

const server = http.createServer((req, res) => {

    res.writeHead(200, {
        "Content-Type": "text/html"
    });

    res.end(`
        <!DOCTYPE html>
        <html>
        <head>
            <title>Node.js App</title>
        </head>
        <body>
            <h1>Hello World from Node.js + Docker!</h1>
            <p><strong>Name:</strong> Kesab Maharana</p>
            <p><strong>Roll No:</strong> 24BCS10653</p>
        </body>
        </html>
    `);
});

server.listen(3000, () => {
    console.log("Node.js server running on port 3000");
});
