# Воспользуемся встроенными данными npk, иллюстрирующими влияние применения различных удобрений на урожайность гороха (yield). Нашей задачей будет выяснить, существенно ли одновременное применение азота (фактор N) и фосфата (фактор P). Примените дисперсионный анализ, где будет проверяться влияние фактора применения азота (N), влияние фактора применения фосфата (P) и их взаимодействие.
# В ответе укажите p-value для взаимодействия факторов N и P.

# Десятичный разделитель - запятая!

df <- npk
fit <- aov(yield ~ N + P, data=df)
summary(fit)