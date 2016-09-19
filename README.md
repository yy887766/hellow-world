# hellow-world
Just a sample
[pid  4908] uname({sys="Linux", node="csdpmsprdap6010", ...}) = 0
[pid  4908] socket(PF_INET, SOCK_DGRAM, IPPROTO_UDP) = 3
[pid  4908] bind(3, {sa_family=AF_INET, sin_port=htons(0), sin_addr=inet_addr("0.0.0.0")}, 16) = 0
[pid  4908] connect(3, {sa_family=AF_INET, sin_port=htons(0), sin_addr=inet_addr("172.26.40.19")}, 16) = 0
[pid  4908] getsockname(3, {sa_family=AF_INET, sin_port=htons(46513), sin_addr=inet_addr("172.26.40.195")}, [16]) = 0
[pid  4908] mount("172.26.40.19:/vol/DDA_NFS_ADCAL_VOL1", "/pms-test", "nfs", 0, "vers=4,addr=172.26.40.19,clienta"...) = -1 EPROTONOSUPPORT (Protocol not supported)
[pid  4908] open("/etc/nsswitch.conf", O_RDONLY) = 4
