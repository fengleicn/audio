import pandas
from flask import Flask
from flask_cors import *


app = Flask(__name__)
CORS(app, supports_credentials=True)


@app.route("/")
def index():
    import subprocess
    result = subprocess.check_output(
        ["/bin/bash", "-c", "shuf words.txt | head -n1"], shell=False)
    l = result.decode("utf-8").split()
    ret = {'word': l[0], 'chinese': l[1:]}
    return ret


if __name__ == "__main__":
    pass
