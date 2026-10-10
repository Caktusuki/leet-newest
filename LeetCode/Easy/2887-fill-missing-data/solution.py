import pandas as pd

def fillMissingValues(pro: pd.DataFrame) -> pd.DataFrame:
     pro["quantity"]=pro["quantity"].fillna(0)
     return pro
