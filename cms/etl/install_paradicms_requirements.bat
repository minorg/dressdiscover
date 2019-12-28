@ECHO OFF
cd %~dp0
CALL venv\Scripts\activate.bat
pip install -r ..\..\..\paradicms\etl\requirements.txt
