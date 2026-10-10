import pandas as pd

def renameColumns(stud: pd.DataFrame) -> pd.DataFrame:
   return stud.rename(columns={
        "id":"student_id",
        "first":"first_name",
        "last":"last_name",
        "age":"age_in_years"
        })
