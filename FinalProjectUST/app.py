from pickle import TRUE

from flask import Flask, render_template, request
from flask_mysqldb import MySQL

app = Flask(__name__)


app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = 'root'
app.config['MYSQL_DB'] = 'project'

mysql = MySQL(app)


@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == "POST":
        details = request.form

        UID = details['uid1']
        Name = details['name1']
        CName = details['cname1']
        Email = details['email1']
        cur = mysql.connection.cursor()
        cur.execute("INSERT INTO Form(UID,Name,Company_Name,Email) VALUES (%s, %s,%s,%s)" ,(UID,Name,CName,Email))
        mysql.connection.commit()
        cur.close()
        cur1= mysql.connection.cursor()
        cur1.execute("SELECT * FROM Form")
        data = cur1.fetchall()
        cur1.close()
        return render_template('template.html',uid=UID,nid=Name,cid=CName,eid=Email,data=data)
    return render_template('index.html')


if __name__ == '__main__':
    app.run()