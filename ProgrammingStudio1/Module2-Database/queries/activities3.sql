SELECT 
--    strftime("%j", "now"),
--    unixepoch() - unixepoch('2004-01-01');
--    unixepoch('subsec')

    strftime("%d/%m/%Y", JoinDate) AS 'Date Joined',
    unixepoch() AS 'Current epoch time',
    unixepoch(JoinDate) AS 'JoinDate epoch',
    unixepoch() - unixepoch(JoinDate) AS 'Elapsed epoch',
    strftime("%s", (unixepoch() - unixepoch(JoinDate))),
    julianday('now') - julianday(JoinDate) As 'Date and years',
    Cast((julianday('now') - julianday(JoinDate))/365.25 AS Integer) AS Years
    
FROM MEMBER;