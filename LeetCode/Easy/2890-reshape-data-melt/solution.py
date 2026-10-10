import pandas as pd

def meltTable(rep: pd.DataFrame) -> pd.DataFrame:
   return pd.melt(rep,
        id_vars=['product'],var_name='quarter',value_name='sales'
    )
   
