import pandas as pd

def changeDatatype(stud: pd.DataFrame) -> pd.DataFrame:
    stud["grade"]=stud["grade"].astype(int)
    return stud
