CREATE TABLE IF NOT EXISTS t_car (
  id UUID NOT NULL DEFAULT uuid_generate_v1() ,
  model VARCHAR(255) NOT NULL
)