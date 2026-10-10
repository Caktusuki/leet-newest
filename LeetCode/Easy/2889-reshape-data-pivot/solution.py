import pandas as pd

def pivotTable(weat: pd.DataFrame) -> pd.DataFrame:
    return weat.pivot(index='month',columns='city',values='temperature')
