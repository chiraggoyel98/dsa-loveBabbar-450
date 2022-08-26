## Dagster Tranformer

Transformation project for the tenanto

### Local Setup 

* Check the project from [here](https://github.com/tenanto-international-market/dagster-transformer)
* Make sure you have python > 3.8 is installed
* Run Below command to setup virtual environment  

```
cd dagster-transformation
python3 -m venv venv
```

* Activate the virtual environment

```
source venv/bin/activate
```

* Install the dependencies

```
pip3 install dagster
pip3 install dagit
pip3 install pyjq
```

* After installation 

```
dagit -f coliving.py
```
