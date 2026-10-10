import pandas as pd

def findHeavyAnimals(ani: pd.DataFrame) -> pd.DataFrame:
    return ani[ani['weight']>100].sort_values(['weight'],ascending=False)[['name']]
