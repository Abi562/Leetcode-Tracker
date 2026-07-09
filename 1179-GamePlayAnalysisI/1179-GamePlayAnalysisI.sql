-- Last updated: 7/9/2026, 3:13:13 PM
select player_id,min(event_date) as first_login
from Activity
group by player_id