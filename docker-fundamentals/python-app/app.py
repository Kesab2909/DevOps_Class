from http.server import BaseHTTPRequestHandler, HTTPServer


class Handler(BaseHTTPRequestHandler):

    def do_GET(self):

        response = """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Python App</title>
        </head>
        <body>
            <h1>Hello World from Python + Docker!</h1>
            <p><strong>Name:</strong> Kesab Maharana</p>
            <p><strong>Roll No:</strong> 24BCS10653</p>
        </body>
        </html>
        """

        self.send_response(200)
        self.send_header("Content-Type", "text/html")
        self.send_header("Content-Length", str(len(response.encode())))
        self.end_headers()

        self.wfile.write(response.encode())


server = HTTPServer(("0.0.0.0", 5000), Handler)

print("Python server running on port 5000")

server.serve_forever()
